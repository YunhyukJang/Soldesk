--isolation�� ���� ����
set transaction isolation 
level serializable;

--step 1
Select sum(price) �Ѿ� 
from book;

--step 3
Select sum(price) �Ѿ� 
from book;

Select * 
from book;

commit;