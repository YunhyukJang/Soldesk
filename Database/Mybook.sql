drop table mybook;

create table mybook(
bookid number(10), 
price number(20)
);

Select * 
from mybook;

insert into mybook values(1, 10000);
insert into mybook values(2, 20000);
insert into mybook values(3, null);

Select price+100 
from mybook 
where bookid=3;

Select sum(price), avg(price), count(*), count(price) 
from mybook 
where bookid <= 4;

Select * 
from mybook 
where price is null;