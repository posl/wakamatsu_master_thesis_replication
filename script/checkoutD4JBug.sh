#!/bin/bash

#$1 = project ex)Math
#$2 = id ex) 1
#$3 = is_evosuite [0,1]

dir=/defects4j/projects # Store the buggy projects.
mkdir ${dir}

proj=$1
id=$2
#is_evosuite=$3

defects4j checkout -p $proj -v ${id}b -w ${dir}/${proj}_${id}
defects4j checkout -p $proj -v ${id}f -w ${dir}/${proj}_${id}_fixed

if [ 1 -eq ${3} ]; then
    \cp -f /pom_for_evosuite/${id}/pom.xml ${dir}/${proj}_${id}/pom.xml
    \cp -f /pom_for_evosuite/${id}/pom.xml ${dir}/${proj}_${id}_fixed/pom.xml
fi

cd ${dir}/${proj}_${id}
#defects4j compile
mvn compile
mvn test-compile
cd ${dir}/${proj}_${id}_fixed
#defects4j compile
mvn compile
mvn test-compile

cd /script
