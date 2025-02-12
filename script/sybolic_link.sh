
mkdir -p /SimFix/projects/math
for id in `seq 1 106`
do
    ln -s /defects4j/projects/Math_${id} /SimFix/projects/math/math_${id}_buggy
done
