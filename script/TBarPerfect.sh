#!/bin/bash

bugDataPath=/defects4j/projects/
bugID=${1}_${2}
defects4jHome=/defects4j/
isTestFixPatterns=true

cd /TBar/
#java -Xmx1g -cp "target/dependency/*" edu.lu.uni.serval.tbar.main.MainPerfectFL $bugDataPath $bugID $defects4jHome $isTestFixPatterns
timeout -sKILL 10800 java -Xmx1g -cp "target/dependency/*" edu.lu.uni.serval.tbar.main.MainPerfectFL $bugDataPath $bugID $defects4jHome $isTestFixPatterns
cd /script/
