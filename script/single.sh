#!/bin/sh

#$1 = Math
#$2 = id

dir=/defects4j/projects
bug_pro=${dir}/${1}_${2}

/bin/bash ./checkoutD4JBug.sh ${1} ${2} 1

cd ${bug_pro}
mvn dependency:copy-dependencies -DoutputDirectory=lib
\cp -r lib ${bug_pro}_fixed/lib

# execute SELogger
cd ${bug_pro}
if [ ${2} -le 35 ] ; then
  testPackage="src/test/java/org/apache/commons/math3/"
elif [ ${2} -le 84 ] ; then
  testPackage="src/test/java/org/apache/commons/math/"
else
  testPackage="src/test/org/apache/commons/math/"
fi
\cp -f /fail_test/${2}/FailTestCall.java ${testPackage}
if [ ${2} -le 35 ] ; then
  fqn="org.apache.commons.math3"
else
  fqn="org.apache.commons.math"
fi
mvn compile
mvn test-compile



timeout -sKILL 1200 java -classpath `find lib/junit*`:target/test-classes/:target/classes/ -javaagent:/tool/selogger-0.2.3.jar ${fqn}.FailTestCall
python3 /script/selogger_classes.py
\cp -f classes_grep.csv ${bug_pro}_fixed


# execute EvoSuite
cd ${bug_pro}_fixed
## 失敗テストを起点にテスト生成
#mvn -Dcores=2 -DmemoryInMB=4000 -Dcuts=`defects4j query -p Math -q "tests.trigger" | grep -e "^${1}," | perl -pe "s/;/\n/g" | sed -e "s/^.*,//g" | sed "s/\"//g" | sed -e "s/::.*$//g" | uniq | sed -e "s/$/,/g" | sed -e "s/Test//g" | perl -pe "s/\n//g"` evosuite:generate
## 実行経路を起点に修正
mvn -Dcores=2 -DmemoryInMB=4000 -Dcuts=`sh /script/selogger-classes.sh` evosuite:generate

\cp -r .evosuite ${bug_pro}/.evosuite

cd ${bug_pro}
mvn evosuite:export
mvn compile
mvn test-compile
mvn evosuite:prepare

