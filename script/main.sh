cd /script/

if [ $# -ne 3 ]; then
    echo 'iligal argument'
    echo 'ex)main.sh 1(id) 1(is_evo) 1(fixer)'
    exit 0
fi


id=${1}
is_evo=${2}
#fixer
#   0: None
#   1: AVATAR
#   2: TBar
#   3: SimFix 
#   4: Repilot
#   5: AlphaRepair
#   6: RAP-Gen
fixer=${3}
out_df_dir=/data/wakamatsu-apr
out_dir=${out_df_dir}
patch_dir=None
fl_dir=None

#prepare project
if [ 1 -eq ${is_evo} ]; then
    /bin/bash ./single.sh Math ${id}
    # rm -r /defects4j/projects/Math_${id}/src/test/evosuite
else
    /bin/bash ./checkoutD4JBug.sh Math ${id} ${is_evo}
fi

#fixer
if [ 0 -eq ${fixer} ]; then
    exit 0
elif [ 1 -eq ${fixer} ]; then
    #execute
    python3 ./MyReport.py AVATAR Math_${id}
    /bin/bash ./AVATARCompile.sh
    /bin/bash ./AVATARFix.sh Math ${id}
    #set_dir
    out_dir="${out_dir}/AVATAR/OUTPUT_${id}_${is_evo}"
    patch_dir="/AVATAR/OUTPUT/"
    fl_dir="/AVATAR/SuspiciousCodePositions/"
elif [ 2 -eq ${fixer} ]; then
    python3 ./MyReport.py TBar Math_${id}
    if [ 1 -eq ${is_evo} ]; then
        rm -r /TBar/SuspiciousCodePositions
        cp -r /SuspiciousCodePositions /TBar
    fi
    /bin/bash ./TBarNormal.sh Math ${id}
    out_dir="${out_dir}/TBar/last/OUTPUT_${id}_${is_evo}"
    patch_dir="/TBar/OUTPUT/"
elif [ 3 -eq ${fixer} ]; then
    python3 ./MyReport.py SimFix Math_${id}
    /bin/bash ./SimFix.sh math ${id}
    out_dir="${out_dir}/SimFix/a/OUTPUT_${id}_${is_evo}"
    patch_dir="/SimFix/patch/math/${id}"
elif [ 4 -eq ${fixer} ]; then
    /bin/bash ./Repilot.sh math ${id}
    out_dir="${out_dir}/Repilot/a/OUTPUT_${id}_${is_evo}"
    patch_dir="/Repilot/out_${id}"
elif [ 5 -eq ${fixer} ]; then
    /bin/bash ./AlphaRepair.sh Math ${id}
    out_dir="${out_dir}/AlphaRepair/a/OUTPUT_${id}_${is_evo}"
    patch_dir="/AlphaRepair/codebert_result"
elif [ 6 -eq ${fixer} ]; then
    /bin/bash ./RAP-Gen.sh Math ${id}
    out_dir="${out_dir}/RAP-Gen/a/OUTPUT_${id}_${is_evo}"
    patch_dir="/RAP-Gen/results"
fi

#move outfile
if [ ${out_df_dir} == ${out_dir} ]; then
    mkdir -p ${out_df_dir}/NO_OUT
    touch ${out_df_dir}/NO_OUT/${1}_${2}_${3}
else
    mkdir -p ${out_dir}

    if [ -d ${patch_dir} ]; then
        mv ${patch_dir} ${out_dir}
    else
        touch ${out_dir}/NO_PATCH
    fi

    if [ -d ${fl_dir} ]; then
        mv ${fl_dir} ${out_dir}
    else
        touch ${out_dir}/NO_FL
    fi
fi

cd /script/
