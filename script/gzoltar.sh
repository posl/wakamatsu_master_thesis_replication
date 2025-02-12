#!/usr/bin/env bash
#
# ------------------------------------------------------------------------------
# This script performs fault-localization on a Java project using the GZoltar
# command line interface either using instrumentation 'at runtime' or 'offline'.
#
# Usage:
# ./run.sh
#     --instrumentation <online|offline>
#     [--help]
#
# Requirements:
# - `java` and `javac` needs to be set and must point to the Java installation.
#
# ------------------------------------------------------------------------------

#$1 = project ex)Math
#$2 = id ex) 1
PROJECT_NAME=${1}_${2}
OUTFILE_DIR=/gzoltar/outfile
PROJECT_DIR=/defect4sj/projects/${PROJECT_NAME}




# ------------------------------------------------------------------ Envs & Args

GZOLTAR_VERSION="1.7.4-SNAPSHOT"

# Check whether GZOLTAR_CLI_JAR is set
export GZOLTAR_CLI_JAR="$OUTFILE_DIR/../com.gzoltar.cli/target/com.gzoltar.cli-$GZOLTAR_VERSION-jar-with-dependencies.jar"
[ "$GZOLTAR_CLI_JAR" != "" ] || echo "GZOLTAR_CLI is not set!"
[ -s "$GZOLTAR_CLI_JAR" ] || echo "$GZOLTAR_CLI_JAR does not exist or it is empty! Please go to '$OUTFILE_DIR/..' and run 'mvn clean install'."

# Check whether GZOLTAR_AGENT_RT_JAR is set
export GZOLTAR_AGENT_RT_JAR="$OUTFILE_DIR/../com.gzoltar.agent.rt/target/com.gzoltar.agent.rt-$GZOLTAR_VERSION-all.jar"
[ "$GZOLTAR_AGENT_RT_JAR" != "" ] || echo "GZOLTAR_AGENT_RT_JAR is not set!"
[ -s "$GZOLTAR_AGENT_RT_JAR" ] || echo "$GZOLTAR_AGENT_RT_JAR does not exist or it is empty! Please go to '$OUTFILE_DIR/..' and run 'mvn clean install'."

INSTRUMENTATION="offline"

#
# Prepare runtime dependencies
#
LIB_DIR="$OUTFILE_DIR/lib"
mkdir -p "$LIB_DIR" || echo "Failed to create $LIB_DIR!"
[ -d "$LIB_DIR" ] || echo "$LIB_DIR does not exist!"

JUNIT_JAR="$LIB_DIR/junit.jar"
if [ ! -s "$JUNIT_JAR" ]; then
  wget "https://repo1.maven.org/maven2/junit/junit/4.12/junit-4.12.jar" -O "$JUNIT_JAR" || echo "Failed to get junit-4.12.jar from https://repo1.maven.org!"
fi
[ -s "$JUNIT_JAR" ] || echo "$JUNIT_JAR does not exist or it is empty!"

HAMCREST_JAR="$LIB_DIR/hamcrest-core.jar"
if [ ! -s "$HAMCREST_JAR" ]; then
  wget -np -nv "https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar" -O "$HAMCREST_JAR" || echo "Failed to get hamcrest-core-1.3.jar from https://repo1.maven.org!"
fi
[ -s "$HAMCREST_JAR" ] || echo "$HAMCREST_JAR does not exist or it is empty!"

BUILD_DIR="$OUTFILE_DIR/build"
rm -rf "$BUILD_DIR"
mkdir -p "$BUILD_DIR" || echo "Failed to create $BUILD_DIR!"

SRC_DIR="$OUTFILE_DIR/src"
TEST_DIR="$OUTFILE_DIR/test"

# ------------------------------------------------------------------------- Main

#
# Compile
#

echo "Compile source and test cases ..."

#javac "$SRC_DIR/org/gzoltar/examples/CharacterCounter.java" -d "$BUILD_DIR" || echo "Failed to compile source code!"
#javac -cp $JUNIT_JAR:$BUILD_DIR "$TEST_DIR/org/gzoltar/examples/CharacterCounterTest.java" -d "$BUILD_DIR" || echo "Failed to compile test cases!"

cp -r /defects4j/projects/${PROJECT_NAME}/target/classes/* $BUILD_DIR
cp -r /defects4j/projects/${PROJECT_NAME}/target/test-classes/* $BUILD_DIR

#
# Collect list of unit test cases to run
#

echo "Collect list of unit test cases to run ..."

UNIT_TESTS_FILE="$BUILD_DIR/tests.txt"

java -cp $BUILD_DIR:$JUNIT_JAR:$HAMCREST_JAR:$GZOLTAR_CLI_JAR \
  com.gzoltar.cli.Main listTestMethods $BUILD_DIR \
    --outputFile "$UNIT_TESTS_FILE" \
    --includes "org.apache.commons.math3.fraction.BigFraction_ESTest#*" || echo "Collection of unit test cases has failed!"
[ -s "$UNIT_TESTS_FILE" ] || echo "$UNIT_TESTS_FILE does not exist or it is empty!"

#
# Collect coverage
#

SER_FILE="$BUILD_DIR/gzoltar.ser"

echo "Perform offline instrumentation ..."

# Backup original classes
BUILD_BACKUP_DIR="$OUTFILE_DIR/.build"
mv "$BUILD_DIR" "$BUILD_BACKUP_DIR" || echo "Backup of original classes has failed!"
mkdir -p "$BUILD_DIR"

# Perform offline instrumentation
java -cp $BUILD_BACKUP_DIR:$GZOLTAR_AGENT_RT_JAR:$GZOLTAR_CLI_JAR \
com.gzoltar.cli.Main instrument \
--outputDirectory "$BUILD_DIR" \
$BUILD_BACKUP_DIR || echo "Offline instrumentation has failed!"

echo "Run each unit test case in isolation ..."

# Run each unit test case in isolation
java -cp $BUILD_DIR:$JUNIT_JAR:$HAMCREST_JAR:$GZOLTAR_AGENT_RT_JAR:$GZOLTAR_CLI_JAR \
    -Dgzoltar-agent.destfile=$SER_FILE \
    -Dgzoltar-agent.output="file" \
    com.gzoltar.cli.Main runTestMethods \
    --testMethods "$UNIT_TESTS_FILE" \
    --offline \
    --collectCoverage || echo "Coverage collection has failed!"

# Restore original classes
cp -R $BUILD_BACKUP_DIR/* "$BUILD_DIR" || echo "Restore of original classes has failed!"
rm -rf "$BUILD_BACKUP_DIR"

[ -s "$SER_FILE" ] || echo "$SER_FILE does not exist or it is empty!"

#
# Create fault localization report
#

echo "Create fault localization report ..."

SPECTRA_FILE="$BUILD_DIR/sfl/txt/spectra.csv"
MATRIX_FILE="$BUILD_DIR/sfl/txt/matrix.txt"
TESTS_FILE="$BUILD_DIR/sfl/txt/tests.csv"

java -cp $BUILD_DIR:$JUNIT_JAR:$HAMCREST_JAR:$GZOLTAR_CLI_JAR \
  com.gzoltar.cli.Main faultLocalizationReport \
    --buildLocation "$BUILD_DIR" \
    --granularity "line" \
    --inclPublicMethods \
    --inclStaticConstructors \
    --inclDeprecatedMethods \
    --dataFile "$SER_FILE" \
    --outputDirectory "$BUILD_DIR" \
    --family "sfl" \
    --formula "ochiai" \
    --metric "entropy" \
    --formatter "txt" || echo "Generation of fault-localization report has failed!"

[ -s "$SPECTRA_FILE" ] || echo "$SPECTRA_FILE does not exist or it is empty!"
[ -s "$MATRIX_FILE" ] || echo "$MATRIX_FILE does not exist or it is empty!"
[ -s "$TESTS_FILE" ] || echo "$TESTS_FILE does not exist or it is empty!"

echo "DONE!"
exit 0
