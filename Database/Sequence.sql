select * 
from book;

select * 
from orders;

select * 
from customer;

/*
start with:sequence�� ���۰�
increment by:������
minvalue:sequence �ּҰ�
maxvalue:sequence�� ������ �ִ밪
cycle/no cycle:�ִ밪 ���� �� ��ȯ ����
cache/no cache:���ϴ� ���ڸ�ŭ �̸� ���� memory�� library cache�� 
���� ��Ű���� ����
*/

--sequence ����
create sequence SEQ_TEST1 
start with 1 
increment by 1 
maxvalue 100 cycle nocache;

--sequence ���
drop table emp_seq;

create table emp_seq(
id number, 
name varchar2(30), 
day timestamp with time zone default systimestamp
);

select * 
from emp_seq;

insert into emp_seq values(SEQ_TEST1.nextval, user, default);
insert into emp_seq values(SEQ_TEST1.nextval, '������', default);

--100���� �����ؼ� 10�� �����ϰ� �ִ� 1000����, ��ȯ ����, ĳ�� ���� ����
--sequence:SEQ_TEST2
--table:sale_seq(id, name, price, day(���� �ð�))
create sequence SEQ_TEST2 
start with 100 
increment by 10 
maxvalue 1000 
cycle nocache;

drop table sale_seq;

create table sale_seq(
id number, 
name varchar(20), 
price number, 
day timestamp with time zone default systimestamp
);

select * 
from sale_seq;

insert into sale_seq values(SEQ_TEST2.nextval, user, 27000, default);
insert into sale_seq values(SEQ_TEST2.nextval, '������', 32000, default);