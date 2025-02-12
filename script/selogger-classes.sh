while read line; do
  echo -n $line | perl -pe "s/\//./g"
  echo -n ","
done < classes_grep.csv
