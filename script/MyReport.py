import glob
import sys
import os
import subprocess
import time


def main():
    my_report = MyReport()
    my_report.exe_mvn_test()

    if my_report.fixer == "SimFix":
        my_report.make_d4j_info()


class MyReport:
    def __init__(self):
        self.fixer = sys.argv[1]
        self.project_id = sys.argv[2]
        # self.fixer ='AVATAR'
        # self.project_id = 'Math_1'
        self.project, self.id = self.project_id.split('_')
        self.base_path = '/mvn'
        self.project_path = f'/defects4j/projects/{self.project_id}'
        self.my_report_path = f'{self.base_path}/{self.fixer}'
        self.my_report_file = f'{self.my_report_path}/{self.project_id}.txt'
 
        if not os.path.isdir(self.my_report_path):
            os.makedirs(self.my_report_path)
               
        self.is_first = True
        if os.path.isfile(self.my_report_file):
            self.is_first = False


    def shell_run(self, cmd, timeout = 18000):
        cmd = f'timeout {timeout} {cmd}'

        time_sta = time.perf_counter()
        subprocess.run(cmd, cwd=self.project_path, shell=True, encoding='utf-8' ,capture_output=False)
        time_end = time.perf_counter()

        if time_end - time_sta > timeout - 5:
            print(f'Timeout because {time_end - time_sta}s is too long')
            # abnormal end
            return 1
        return 0

# doing
    def exe_mvn_test(self):

        cmd = "mvn clean"
        self.shell_run(cmd)
        if self.is_first:
            cmd = 'mvn surefire-report:report'
            self.shell_run(cmd)
            self.summarize_report()
            return
       
        with open(self.my_report_file) as fr:
            text = fr.read()
        false_test = text.split('\n')
        del false_test[0]

        cmd = 'mvn surefire-report:report'
        if len(false_test) > 0:
            cmd2 = cmd + " -Dtest="

        class_list = set()
        for i in false_test:
            class_name,test_case_name = i[3:].split('::')
            class_list.add(class_name)
        for i in class_list:
            cmd2 +=f'{i},'

        cmd = cmd[:-1]
                

    def summarize_report(self):
        # it must be change if it change target file
        surefire_path = f'{self.project_path}/target/surefire-reports'
        report_files = glob.glob(f'{surefire_path}/*.txt')
        false_test = list()
        for file in report_files:
            with open(file) as fr:
                text = fr.read()

            text = text.split('\n')
            for line in text:
                if (("ERROR!" in line) or ("FAILURE!" in line)) and not "Tests run:" in line:
                    
                    test_case_name = line[0:line.find('(')]
                    class_name = line[line.find('(') + 1:line.find(')')]
                    false_test.append(f' - {class_name}::{test_case_name}')

        print(f'Failing tests: {len(false_test)}')
        text = f'Failing tests: {len(false_test)}\n'

        if not self.is_first:
            with open(self.my_report_file) as fr:
                false_test = fr.read()
            false_test = false_test.split('\n')
            del false_test[0]

        for i in false_test:
            text += f'{i}\n'
        text = text[:-1]

        with open(self.my_report_file, 'w') as fw:
            fw.write(text)
        cmd = f'chmod 777 {self.my_report_file}'
        subprocess.run(cmd, cwd=self.project_path, shell=True, encoding='utf-8' ,capture_output=False)

    def dummy_report(self):
        text = f'Failing tests: 999\n'
        with open(self.my_report_file, 'w') as fw:
            fw.write(text)
        cmd = f'chmod 777 {self.my_report_file}'
        subprocess.run(cmd, cwd=self.project_path, shell=True, encoding='utf-8' ,capture_output=False)


    def make_d4j_info(self):
        info_path = '/SimFix/d4j-info'
        tmp = f'{self.project.lower()}/{self.id}.txt'
        info_fpath = f'{info_path}/failed_tests/{tmp}'
        info_apath = f'{info_path}/all_tests/{tmp}'
        with open(self.my_report_file) as fr:
            false_test = fr.read()
        false_test = false_test.split('\n')
        del false_test[0]
        text = '\n'.join(false_test)
        with open(info_fpath, 'w') as fw:
            fw.write(text)
        
    def is_test_result(self, class_name = ''):
        # it must be change if it change target file
        surefire_path = f'{self.project_path}/target/surefire-reports'
        if class_name != '':
            report_files = glob.glob(f'{surefire_path}/{class_name}.txt')
        else:
            report_files = glob.glob(f'{surefire_path}/*.txt')

        for file in report_files:
            with open(file) as fr:
                text = fr.read()

            text = text.split('\n')
            for line in text:
                if (("ERROR!" in line) or ("FAILURE!" in line)) and not "Tests run:" in line:
                    return False
        return True
                    
                    

        
if __name__ =="__main__":
    main()
