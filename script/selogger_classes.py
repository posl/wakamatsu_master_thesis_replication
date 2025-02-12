import pandas as pd
import subprocess
import re

def grep(path, out):
    with open(path) as f:
        lines = f.readlines()

    lines_strip = [line.strip() for line in lines]

    pwd = subprocess.check_output( ["pwd"] ).decode()
    bid = int(re.sub(r"\D", "", pwd))

    if bid <= 35:
        l = [line for line in lines_strip if 'org/apache/commons/math3' in line]
    else:
        l = [line for line in lines_strip if 'org/apache/commons/math' in line]
    l = [line for line in l if 'target/classes/' in line]

    with open(out, 'w') as f:
        for line in l:
            f.write("%s\n" % line)

    columnList = ['ID', 'jar/dir', 'class file', 'class name', 'weaving result', 'MD5 hash']
    df = pd.read_csv(out, names=columnList)
    df = df.set_index('ID')
    df = pd.DataFrame(df, columns=['class file'])
    df = df[~df['class file'].str.contains('\$')]
    df = df[~df['class file'].str.contains('Exception')]
    df = df[~df['class file'].str.contains('exception')]
    df = df.set_index('class file')
    df.to_csv(out, header=False)

grep('selogger-output/classes.txt', 'classes_grep.csv')

