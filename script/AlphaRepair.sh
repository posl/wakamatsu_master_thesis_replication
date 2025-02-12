#!/bin/bash
# ex) $1=project_name=Math
# ex) $2=bug_id=1

cd /AlphaRepair/

timeout -sKILL 10800 python experiment.py --bug_id "$1-$2"

cd /script/
