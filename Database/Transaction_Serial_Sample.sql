set transaction isolation 
level read committed;

--step 2
Select sum(price) 총액 
from madang.book;

insert into madang.book values(56, '테스트2', '테스트출판사', 6500);

--step 4
Select sum(price) 총액 
from madang.book;

commit;