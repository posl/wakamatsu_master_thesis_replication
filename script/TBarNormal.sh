#!/bin/bash

bugDataPath=/defects4j/projects/
bugID=${1}_${2}
defects4jHome=/defects4j/

cd /TBar/
timeout -sKILL 10800 java -Xmx1g -cp "target/dependency/*" edu.lu.uni.serval.tbar.main.Main $bugDataPath $bugID $defects4jHome
cd /script/
