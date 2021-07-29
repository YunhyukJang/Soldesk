--������ �Ի��� ��� �� ���
--��� 1
Select to_char(hire_date, 'MM') MONTH, count(*) 
from employees 
group by to_char(hire_date, 'MM') 
order by to_char(hire_date, 'MM');

--��� 2
Select decode(to_char(hire_date, 'MM'), '01', count(*), 0) "1��", 
decode(to_char(hire_date, 'MM'), '02', count(*), 0) "2��", 
decode(to_char(hire_date, 'MM'), '03', count(*), 0) "3��", 
decode(to_char(hire_date, 'MM'), '04', count(*), 0) "4��", 
decode(to_char(hire_date, 'MM'), '05', count(*), 0) "5��", 
decode(to_char(hire_date, 'MM'), '06', count(*), 0) "6��", 
decode(to_char(hire_date, 'MM'), '07', count(*), 0) "7��", 
decode(to_char(hire_date, 'MM'), '08', count(*), 0) "8��", 
decode(to_char(hire_date, 'MM'), '09', count(*), 0) "9��", 
decode(to_char(hire_date, 'MM'), '10', count(*), 0) "10��", 
decode(to_char(hire_date, 'MM'), '11', count(*), 0) "11��", 
decode(to_char(hire_date, 'MM'), '12', count(*), 0) "12��" 
from employees 
group by to_char(hire_date, 'MM') 
order by to_char(hire_date, 'MM');

--��� 3
Select sum(decode(to_char(hire_date, 'MM'), '01', count(*), 0)) "1��", 
sum(decode(to_char(hire_date, 'MM'), '02', count(*), 0)) "2��", 
sum(decode(to_char(hire_date, 'MM'), '03', count(*), 0)) "3��", 
sum(decode(to_char(hire_date, 'MM'), '04', count(*), 0)) "4��", 
sum(decode(to_char(hire_date, 'MM'), '05', count(*), 0)) "5��", 
sum(decode(to_char(hire_date, 'MM'), '06', count(*), 0)) "6��", 
sum(decode(to_char(hire_date, 'MM'), '07', count(*), 0)) "7��", 
sum(decode(to_char(hire_date, 'MM'), '08', count(*), 0)) "8��", 
sum(decode(to_char(hire_date, 'MM'), '09', count(*), 0)) "9��", 
sum(decode(to_char(hire_date, 'MM'), '10', count(*), 0)) "10��", 
sum(decode(to_char(hire_date, 'MM'), '11', count(*), 0)) "11��", 
sum(decode(to_char(hire_date, 'MM'), '12', count(*), 0)) "12��" 
from employees 
group by to_char(hire_date, 'MM') 
order by to_char(hire_date, 'MM');

--�μ���ȣ�� ������ �������� ��ü ���� �׷캰�� ���� �� �޿��հ�� �ο����� ���
Select department_id, job_id, to_char(sum(salary), '$999,999.00') �޿��հ�, count(*) �ο���
from employees 
group by department_id, job_id 
order by department_id;

--�μ���ȣ�� ������ �������� ��ü ���� �׷캰�� ���� �� �޿��հ�� �ο��� ��
--�μ��� ������ �� �޿��հ�� �ο������� ���
Select department_id, job_id, to_char(sum(salary), '$999,999.00') �޿��հ�, count(*) �ο���, 
grouping(job_id) ��������
from employees 
group by rollup(department_id, job_id) 
order by department_id;

--���� ����� job_id �߰�
Select department_id, job_id, to_char(sum(salary), '$999,999.00') �޿��հ�, count(*) �ο���, 
grouping(job_id) �������� 
from employees 
group by cube(department_id, job_id) 
order by department_id;

--�� ����� �Ҽӵ� �μ��� �޿��� �������� �������� ����
Select employee_id, first_name || ' ' || last_name name, salary, department_id, 
rank() over(partition by department_id order by salary desc) "rank", 
dense_rank() over(partition by department_id order by salary desc) "dense rank", 
row_number() over(partition by department_id order by salary desc) "row rank"
from employees;

--first(), last() �Լ��� �̿��� �Ҽ� �μ����� �޿��� ���� ���� �ްų� ���� �޴� ����� ���� ���
Select department_id, count(*), 
max(last_name) keep (dense_rank first order by salary desc) as "max_emp_name", 
min(last_name) keep (dense_rank last order by salary desc) as "min_emp_name" 
from employees 
group by department_id;