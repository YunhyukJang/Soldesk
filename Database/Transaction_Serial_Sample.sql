set transaction isolation 
level read committed;

--step 2
Select sum(price) �Ѿ� 
from madang.book;

insert into madang.book values(56, '�׽�Ʈ2', '�׽�Ʈ���ǻ�', 6500);

--step 4
Select sum(price) �Ѿ� 
from madang.book;

commit;