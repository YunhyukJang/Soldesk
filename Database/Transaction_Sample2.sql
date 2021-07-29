set transaction isolation 
level read committed;

Select * 
from madang.users 
where id=1;

update madang.users 
set age=18 
where id=1;

rollback; --취소(원자성)