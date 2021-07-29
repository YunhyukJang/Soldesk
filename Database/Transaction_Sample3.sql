--level read committed:읽기 쓰기 모두 가능한 트랜젝션
set transaction isolation 
level read committed;

--step 2(반복읽기 불가능)
update madang.users 
set age=30 
where id=1;

Select * 
from madang.users 
where id=1;

commit;

Select * 
from madang.users;

Select * 
from madang.users 
where age between 27 and 30;

commit;

--step 2(반복읽기 불가능)
Select sum(price) 
from madang.book;

update madang.book 
set price=price+100 
where bookid=1;

commit;

--유령데이터 step 1
insert into madang.book values(55, 'TEST', 'TEST출판사', 3000);

Select sum(price) 
from madang.book;

commit;