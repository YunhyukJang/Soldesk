--level read committed:�б� ���� ��� ������ Ʈ������
set transaction isolation 
level read committed;

--step 2(�ݺ��б� �Ұ���)
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

--step 2(�ݺ��б� �Ұ���)
Select sum(price) 
from madang.book;

update madang.book 
set price=price+100 
where bookid=1;

commit;

--���ɵ����� step 1
insert into madang.book values(55, 'TEST', 'TEST���ǻ�', 3000);

Select sum(price) 
from madang.book;

commit;