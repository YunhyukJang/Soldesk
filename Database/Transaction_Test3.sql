--�ݺ� �б� �Ұ���:���� ���Ǹ� ���ӿ��� ������� ���ϰ� ���
--�����б⺸�� ������
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

--���ɵ����� �б�
Select * 
from book;

commit;