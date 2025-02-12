#!/bin/bash
# ex) $1=project_name=math
# ex) $2=bug_id=1

# The sybolic link path of containing Defects4J bugs.
d4jData=/SimFix/projects/

# The path of Defects4J git repository.
d4jPath=/defects4j/

cd /SimFix/

if [ ! -e ${d4jData} ]; then
  /bin/bash /script/sybolic_link.sh
fi

#java -Xmx4g -cp "target/dependency/*" edu.lu.uni.serval.main.Main $d4jData $d4jPath $bugId $metric
# timeout -sKILL 10800 java -Xmx4g -cp "target/dependency/*" edu.lu.uni.serval.main.Main $d4jData $d4jPath $bugId $metric

timeout -sKILL 10800 java -jar simfix.jar --proj_home=$d4jData --proj_name=$1 --bug_id=$2

cd /script/
