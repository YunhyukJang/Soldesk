set transaction name 'T1';

Select * 
from book 
where bookid=2;

update book 
set price=7100 
where bookid=1;

update book 
set price=price+100 
where bookid=2;

commit;

create table users(
id number, 
name varchar2(20), 
age number
);

Select * 
from users;

insert into users values(1, 'ȫ�浿', 30);