Select * 
from employees;

drop table employees_2021;

create table employees_2021(
employee_id number(6), 
first_name varchar2(20), 
last_name varchar2(25), 
phone_number varchar2(20), 
hire_date date, 
job_id varchar2(10), 
department_id number(4)
);

Select * 
from employees_2021;

insert into employees_2021(employee_id, first_name, last_name, phone_number, 
hire_date, job_id, department_id) 
select employee_id, first_name, last_name, phone_number, hire_date, 
job_id, department_id 
from employees 
where employees.hire_date > '05/01/01';