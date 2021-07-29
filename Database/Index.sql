/*
�ε����� ���̺��� �� �� �̻��� �Ӽ��� �̿��Ͽ� ������.
���� �˻��� �Բ� ȿ������ ���ڵ� ������ ������.
������� ���ĵ� �Ӽ��� �������� ��ġ�� �����ϹǷ� ���̺��� ���� ������ ������.
����� ������ ���̺��� �κ� ������ ��.
�Ϲ������� B-tree ������ ������ ����.
�������� ����, ���� ���� ������ �߻��ϸ� �ε����� �籸���� �ʿ���.
*/
create index ix_book 
on book(bookname);

create index ix_book2 
on book(publisher);

Select * 
from book 
where bookname like '�౸�� ����';

Select * 
from book 
where publisher like '�������ǻ�' 
and price >= 30000;

Select * 
from book 
where bookid=1;

create index ix_hr 
on employees(first_name);

Select employee_id, last_name, job_id 
from employees 
where first_name like 'Steven';

create index ix_hr2 
on employees(last_name);

Select employee_id, first_name, job_id 
from employees 
where last_name like 'Popp';

--�ε��� �籸��(�ʱ�ȭ)
alter index ix_book rebuild;

--�ε��� ����
drop index ix_book;

--customer���� name���� index ����
create index ix_customer 
on customer(name);

--�ڼ��� �˻�
Select * 
from customer 
where name like '�ڼ���';

--����
drop index ix_customer;

--�ε��� Ȱ��
Select * 
from employees 
where salary >= 10000;

Select * 
from employees 
where job_id='AD_VP';

create index ix_employees 
on employees(salary);