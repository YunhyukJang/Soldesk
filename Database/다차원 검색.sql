--월별로 입사한 사원 수 출력
--방법 1
Select to_char(hire_date, 'MM') MONTH, count(*) 
from employees 
group by to_char(hire_date, 'MM') 
order by to_char(hire_date, 'MM');

--방법 2
Select decode(to_char(hire_date, 'MM'), '01', count(*), 0) "1월", 
decode(to_char(hire_date, 'MM'), '02', count(*), 0) "2월", 
decode(to_char(hire_date, 'MM'), '03', count(*), 0) "3월", 
decode(to_char(hire_date, 'MM'), '04', count(*), 0) "4월", 
decode(to_char(hire_date, 'MM'), '05', count(*), 0) "5월", 
decode(to_char(hire_date, 'MM'), '06', count(*), 0) "6월", 
decode(to_char(hire_date, 'MM'), '07', count(*), 0) "7월", 
decode(to_char(hire_date, 'MM'), '08', count(*), 0) "8월", 
decode(to_char(hire_date, 'MM'), '09', count(*), 0) "9월", 
decode(to_char(hire_date, 'MM'), '10', count(*), 0) "10월", 
decode(to_char(hire_date, 'MM'), '11', count(*), 0) "11월", 
decode(to_char(hire_date, 'MM'), '12', count(*), 0) "12월" 
from employees 
group by to_char(hire_date, 'MM') 
order by to_char(hire_date, 'MM');

--방법 3
Select sum(decode(to_char(hire_date, 'MM'), '01', count(*), 0)) "1월", 
sum(decode(to_char(hire_date, 'MM'), '02', count(*), 0)) "2월", 
sum(decode(to_char(hire_date, 'MM'), '03', count(*), 0)) "3월", 
sum(decode(to_char(hire_date, 'MM'), '04', count(*), 0)) "4월", 
sum(decode(to_char(hire_date, 'MM'), '05', count(*), 0)) "5월", 
sum(decode(to_char(hire_date, 'MM'), '06', count(*), 0)) "6월", 
sum(decode(to_char(hire_date, 'MM'), '07', count(*), 0)) "7월", 
sum(decode(to_char(hire_date, 'MM'), '08', count(*), 0)) "8월", 
sum(decode(to_char(hire_date, 'MM'), '09', count(*), 0)) "9월", 
sum(decode(to_char(hire_date, 'MM'), '10', count(*), 0)) "10월", 
sum(decode(to_char(hire_date, 'MM'), '11', count(*), 0)) "11월", 
sum(decode(to_char(hire_date, 'MM'), '12', count(*), 0)) "12월" 
from employees 
group by to_char(hire_date, 'MM') 
order by to_char(hire_date, 'MM');

--부서번호와 업무를 기준으로 전체 행을 그룹별로 나눈 후 급여합계와 인원수를 출력
Select department_id, job_id, to_char(sum(salary), '$999,999.00') 급여합계, count(*) 인원수
from employees 
group by department_id, job_id 
order by department_id;

--부서번호와 업무를 기준으로 전체 행을 그룹별로 나눈 후 급여합계와 인원수 및
--부서의 업무별 총 급여합계와 인원수합을 출력
Select department_id, job_id, to_char(sum(salary), '$999,999.00') 급여합계, count(*) 인원수, 
grouping(job_id) 업무구분
from employees 
group by rollup(department_id, job_id) 
order by department_id;

--위의 결과에 job_id 추가
Select department_id, job_id, to_char(sum(salary), '$999,999.00') 급여합계, count(*) 인원수, 
grouping(job_id) 업무구분 
from employees 
group by cube(department_id, job_id) 
order by department_id;

--각 사원이 소속된 부서별 급여를 기준으로 내림차순 정렬
Select employee_id, first_name || ' ' || last_name name, salary, department_id, 
rank() over(partition by department_id order by salary desc) "rank", 
dense_rank() over(partition by department_id order by salary desc) "dense rank", 
row_number() over(partition by department_id order by salary desc) "row rank"
from employees;

--first(), last() 함수를 이용한 소속 부서별로 급여를 가장 많이 받거나 적게 받는 사원의 성을 출력
Select department_id, count(*), 
max(last_name) keep (dense_rank first order by salary desc) as "max_emp_name", 
min(last_name) keep (dense_rank last order by salary desc) as "min_emp_name" 
from employees 
group by department_id;