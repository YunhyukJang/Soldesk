--hr 실습
Select employee_id, first_name || ' ' || last_name as "NAME", 
salary, job_id, hire_date, manager_id 
from employees;

--사원정보(Employees) 테이블에서 사원의 이름과 성은 Name, 업무는 Job, 급여는 Salary
--연봉에 100 보너스를 추가하여 계산한 값은 Increase Ann_Salary
--급여에 100 보너스를 추가하여 계산한 연봉은 Increase Salary라는 별칭을 붙여 출력
Select first_name || ' ' || last_name as "Name", 
job_id as "Job", 
salary as "Salary", 
salary*12+100 as "Increase Ann_Salary", 
(salary+100)*12 as "Increase Salary" 
from employees;

--부서별 담당하는 업무를 한 번씩만 출력
Select distinct department_id, job_id 
from employees 
order by department_id;

--이번 분기에 60번 IT부서에서는 신규 프로그램을 개발하고 보급하여 회사에 공헌하였다.
--이에 해당 부서의 사원 급여를 12.3% 인상하기로 하였다.
--60번 IT부서 사원의 급여를 12.3% 인상하여 정수만(반올림) 표시하는 보고서를 작성
--보고서는 사원번호, 성과 이름(Name), 급여, 인상된 급여(Increase Salary)순으로 출력
Select employee_id, 
first_name || ' ' || last_name as "Name", 
salary, 
round(salary*1.123, 0) as "Increase Salary" 
from employees 
where department_id like 60 
order by "Increase Salary";

--ANSI 표준 sql
desc employees;
desc departments;
desc locations;

Select * 
from employees;

Select * 
from departments;

Select * 
from locations;

--Oxford에 근무하는 사원의 이름과 성(Name), 업무, 부서이름, 도시이름 출력
--이 때 첫 번째 열에 회사이름을 상수값으로 적용
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

--Tucker 사원보다 급여를 많이 받고있는 사원의 이름과 성(Name), 업무, 급여를 출력
--중첩질의 사용
Select first_name || ' ' || last_name as "Name", 
job_id, salary 
from employees 
where salary>(select salary 
from employees 
where last_name like 'Tucker');

--사원의 급여 정보 중 업무별 최소 급여를 받고있는 사원의 이름과 성(Name)
--업무, 급여, 입사일을 출력
Select first_name || ' ' || last_name as "Name", 
job_id, salary, hire_date 
from employees 
where salary in (select min(salary) 
from employees 
group by job_id);

--집합연산
--이전 업무 및 현재의 업무를 볼 수 있도록 두 테이블을 합집합 연산으로 출력
Select employee_id, job_id 
from employees 
union select employee_id, job_id 
from job_history 
order by employee_id;

--모든 사원에 대한 업무이력 전체
Select employee_id, job_id, department_id 
from employees 
union all select employee_id, job_id, department_id 
from job_history 
order by employee_id;

--교집합
Select employee_id, job_id 
from employees 
intersect select employee_id, job_id 
from job_history;

--차집합
Select employee_id 
from employees 
minus select employee_id 
from job_history;

--HR부서에서는 신규 프로젝트를 성공으로 이끈 해당 업무자들의 급여를 인상하기로 결정하였다.
--사원은 현재 107명이며 19개의 업무에 소속되어 근무 중이다.
--급여 인상 대상자는 회사의 업무(Distinct job_id) 중 다음 5개 업무에서 일하는 사원에 해당된다.
--나머지 업무에 대해서는 급여가 동결된다. 5개 업무의 급여 인상안은 다음과 같다.
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

--HR부서에서는 최상위 입사일에 해당하는 2001년부터 2003년까지 입사자들의 급여를
--각각 15%, 10%, 7% 인상하여 지분에 따른 배당금으로 지급하고자 한다.
--년도는 to_date('2001-01-01', 'yyyy-mm-dd')
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