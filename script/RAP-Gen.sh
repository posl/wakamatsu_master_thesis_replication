#!/bin/bash
# ex) $1=project_name=Math
# ex) $2=bug_id=1

cd /RAP-Gen/

/bin/bash  ./sh/exp_with_args.sh
timeout -sKILL 10800 python run_exp.py --model_tag codet5_base --task selfapr_rapgen 

cd /script/
