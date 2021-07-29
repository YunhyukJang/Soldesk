--반복 읽기 불가능:같은 질의를 연속에서 사용하지 못하게 잠금
--오손읽기보다 강력함
set transaction isolation 
level repeatable read;

commit;

set transaction isolation 
level read committed;

--step 1
Select * 
from users 
where id=1;

--step 3
insert into users values(3, 'Bob', 27);

Select * 
from madang.users;

commit;

--step 1
Select sum(price) 
from book;

--유령데이터 읽기
Select * 
from book;

commit;