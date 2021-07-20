select * 
from book;

select * 
from orders;

select * 
from customer;

/*
start with:sequence의 시작값
increment by:증가값
minvalue:sequence 최소값
maxvalue:sequence가 끝나는 최대값
cycle/no cycle:최대값 도달 시 순환 여부
cache/no cache:원하는 숫자만큼 미리 만들어서 memory에 library cache에 
상주 시키는지 여부
*/

--sequence 생성
create sequence SEQ_TEST1 
start with 1 
increment by 1 
maxvalue 100 cycle nocache;

--sequence 사용
drop table emp_seq;

create table emp_seq(
id number, 
name varchar2(30), 
day timestamp with time zone default systimestamp
);

select * 
from emp_seq;

insert into emp_seq values(SEQ_TEST1.nextval, user, default);
insert into emp_seq values(SEQ_TEST1.nextval, '장윤혁', default);

--100부터 시작해서 10씩 증가하고 최대 1000까지, 순환 가능, 캐쉬 저장 안함
--sequence:SEQ_TEST2
--table:sale_seq(id, name, price, day(현재 시간))
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
insert into sale_seq values(SEQ_TEST2.nextval, '장윤혁', 32000, default);