--Function
create or replace function fun_interest(price number) 
return int 
is 
myInterest number; 
begin 
if price >= 20000 
then myInterest := price*0.1; 
else myInterest := price*0.05; 
end if; 
return myInterest; 
end;

Select custid, orderid, saleprice, fun_interest(saleprice) interest 
from orders;

--20000 이상의 사원에 대한 연봉 인상율은 5%
--20000 미만의 사원은 3%로 연봉을 인상하는 함수
--함수 이름은 fun_increased
create or replace function fun_increased(salary number) 
return int 
is 
inSalary number; 
begin 
inSalary := 0.0;
if salary >= 20000 
then inSalary := salary*1.05; 
else inSalary := salary*1.03; 
end if; 
return inSalary;
end;

Select first_name || ' ' || last_name name, salary, fun_increased(salary) newSalary
from employees;