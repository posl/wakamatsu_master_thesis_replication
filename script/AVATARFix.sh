#!/bin/bash

# The path of containing Defects4J bugs.
d4jData=/defects4j/projects/

# The path of Defects4J git repository.
d4jPath=/defects4j/

# The fault localization metric used to calculate suspiciousness value of each code line.
metric=Ochiai

# The buggy project ID: e.g., Chart_1
bugId=${1}_${2}

cd /AVATAR/

#java -Xmx4g -cp "target/dependency/*" edu.lu.uni.serval.main.Main $d4jData $d4jPath $bugId $metric
timeout -sKILL 10800 java -Xmx4g -cp "target/dependency/*" edu.lu.uni.serval.main.Main $d4jData $d4jPath $bugId $metric

cd /script/
