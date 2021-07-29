--hr �ǽ�
Select employee_id, first_name || ' ' || last_name as "NAME", 
salary, job_id, hire_date, manager_id 
from employees;

--�������(Employees) ���̺��� ����� �̸��� ���� Name, ������ Job, �޿��� Salary
--������ 100 ���ʽ��� �߰��Ͽ� ����� ���� Increase Ann_Salary
--�޿��� 100 ���ʽ��� �߰��Ͽ� ����� ������ Increase Salary��� ��Ī�� �ٿ� ���
Select first_name || ' ' || last_name as "Name", 
job_id as "Job", 
salary as "Salary", 
salary*12+100 as "Increase Ann_Salary", 
(salary+100)*12 as "Increase Salary" 
from employees;

--�μ��� ����ϴ� ������ �� ������ ���
Select distinct department_id, job_id 
from employees 
order by department_id;

--�̹� �б⿡ 60�� IT�μ������� �ű� ���α׷��� �����ϰ� �����Ͽ� ȸ�翡 �����Ͽ���.
--�̿� �ش� �μ��� ��� �޿��� 12.3% �λ��ϱ�� �Ͽ���.
--60�� IT�μ� ����� �޿��� 12.3% �λ��Ͽ� ������(�ݿø�) ǥ���ϴ� ������ �ۼ�
--������ �����ȣ, ���� �̸�(Name), �޿�, �λ�� �޿�(Increase Salary)������ ���
Select employee_id, 
first_name || ' ' || last_name as "Name", 
salary, 
round(salary*1.123, 0) as "Increase Salary" 
from employees 
where department_id like 60 
order by "Increase Salary";

--ANSI ǥ�� sql
desc employees;
desc departments;
desc locations;

Select * 
from employees;

Select * 
from departments;

Select * 
from locations;

--Oxford�� �ٹ��ϴ� ����� �̸��� ��(Name), ����, �μ��̸�, �����̸� ���
--�� �� ù ��° ���� ȸ���̸��� ��������� ����
Select 'Soldesk', 
first_name || ' ' || last_name as "Name", 
job_id, department_name, city 
from employees emp, departments dep, locations loc 
where emp.department_id=dep.department_id and loc.location_id=dep.location_id 
and loc.city='Oxford';

--ANSI sql
Select 'Soldesk', 
first_name || ' ' || last_name as "Name", 
job_id, department_name, city 
from departments dep 
inner join employees emp on emp.department_id=dep.department_id 
inner join locations loc on dep.location_id=loc.location_id 
where loc.city like 'Oxford';

Select 'Soldesk', 
first_name || ' ' || last_name as "Name", 
job_id, department_name, city 
from departments dep 
join employees emp on emp.department_id=dep.department_id 
join locations loc on dep.location_id=loc.location_id 
where loc.city like 'Oxford';

--Tucker ������� �޿��� ���� �ް��ִ� ����� �̸��� ��(Name), ����, �޿��� ���
--��ø���� ���
Select first_name || ' ' || last_name as "Name", 
job_id, salary 
from employees 
where salary>(select salary 
from employees 
where last_name like 'Tucker');

--����� �޿� ���� �� ������ �ּ� �޿��� �ް��ִ� ����� �̸��� ��(Name)
--����, �޿�, �Ի����� ���
Select first_name || ' ' || last_name as "Name", 
job_id, salary, hire_date 
from employees 
where salary in (select min(salary) 
from employees 
group by job_id);

--���տ���
--���� ���� �� ������ ������ �� �� �ֵ��� �� ���̺��� ������ �������� ���
Select employee_id, job_id 
from employees 
union select employee_id, job_id 
from job_history 
order by employee_id;

--��� ����� ���� �����̷� ��ü
Select employee_id, job_id, department_id 
from employees 
union all select employee_id, job_id, department_id 
from job_history 
order by employee_id;

--������
Select employee_id, job_id 
from employees 
intersect select employee_id, job_id 
from job_history;

--������
Select employee_id 
from employees 
minus select employee_id 
from job_history;

--HR�μ������� �ű� ������Ʈ�� �������� �̲� �ش� �����ڵ��� �޿��� �λ��ϱ�� �����Ͽ���.
--����� ���� 107���̸� 19���� ������ �ҼӵǾ� �ٹ� ���̴�.
--�޿� �λ� ����ڴ� ȸ���� ����(Distinct job_id) �� ���� 5�� �������� ���ϴ� ����� �ش�ȴ�.
--������ ������ ���ؼ��� �޿��� ����ȴ�. 5�� ������ �޿� �λ���� ������ ����.
--HR_REP(10%), MK_REP(12%), PR_REP(15%), SA_REP(18%), IT_PROG(20%)
--decode
Select employee_id, first_name || ' ' || last_name as "NAME", 
job_id, salary, 
decode(job_id, 'HR_REP', 1.10*salary, 
'MK_REP', 1.12*salary, 
'PR_REP', 1.15*salary, 
'SA_REP', 1.18*salary, 
'IT_PROG', 1.20*salary, 
salary) "NEW SALARY" 
from employees;

--case when then
Select employee_id, first_name || ' ' || last_name as "NAME", 
job_id, salary, 
case job_id 
when 'HR_REP' then 1.10*salary 
when 'MK_REP' then 1.12*salary 
when 'PR_REP' then 1.15*salary 
when 'SA_REP' then 1.18*salary 
when 'IT_PROG' then 1.20*salary 
else salary 
end "NEW SALARY" 
from employees;

--HR�μ������� �ֻ��� �Ի��Ͽ� �ش��ϴ� 2001����� 2003����� �Ի��ڵ��� �޿���
--���� 15%, 10%, 7% �λ��Ͽ� ���п� ���� �������� �����ϰ��� �Ѵ�.
--�⵵�� to_date('2001-01-01', 'yyyy-mm-dd')
Select employee_id, 
first_name || ' ' || last_name as "NAME", hire_date, salary, 
case 
when hire_date<to_date('2002-01-01', 'yyyy-mm-dd') then salary*1.15 
when hire_date<to_date('2003-01-01', 'yyyy-mm-dd') then salary*1.10 
when hire_date<to_date('2004-01-01', 'yyyy-mm-dd') then salary*1.07 
else salary 
end "NEW SALARY" 
from employees 
order by hire_date;