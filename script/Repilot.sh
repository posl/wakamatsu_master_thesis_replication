#!/bin/bash
# ex) $1=project_name=math
# ex) $2=bug_id=1

cd /Repilot/
pip install --upgrade pip
pip install -e .
git config --global user.email "repilot@example.com"
git config --global user.name "Repilot"
git config --global init.defaultBranch main
git init
git add README.md
git commit -m "Welcome to Repilot!"

python generate_meta_config_in_docker.py
python -m repilot.cli.init

timeout -sKILL 10800 ACTIVE=1 python -m repilot.cli.main repair -b "$1-$2" --method pruned-mem -d $1-$2-repilot -n 5
python -m repilot.cli.main validate -d $1-$2-repilot
python -m repilot.cli.main evaluate -d $1-$2-repilot >/Repilot/out_$2

cd /script/