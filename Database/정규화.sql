--anomaly 현상
--삭제 이상:deletion anomaly
--삽입 이상:insertion anomaly
--수정 이상:update anomaly
--anomaly 현상을 제거하기 위해서 정규화 작업이 필요하다.
drop table summer;

create table summer(
sid number, 
class varchar2(20), 
price number
);

insert into summer values(100, 'SPRING', 20000);
insert into summer values(150, 'C++', 15000);
insert into summer values(200, 'PYTHON', 10000);
insert into summer values(250, 'SPRING', 20000);

Select * 
from summer;

Select sid, class 
from summer;

Select class, price 
from summer 
where class like 'C++';

Select distinct class 
from summer 
where price in (select max(price) 
from summer);

Select count(*), sum(price) 
from summer;

--삭제 이상
--200번 학생의 수강 취소
Select price 
from summer 
where class='python';

delete from summer where sid=200;

--삽입 이상
insert into summer values(null, 'JAVA', 25000);

Select count(*) 수강인원
from summer;

Select count(sid) 수강인원
from summer;

Select count(*) 수강인원
from summer 
where sid is not null;

--수정 이상
update summer 
set price=20000 
where class='SPRING';

update summer 
set price=15000 
where class='SPRING' 
and sid=100;

Select distinct price "SPRING 수강료" 
from summer 
where class='SPRING' and sid=100;

--정규화:테이블의 세분화(summerprice/summerclass)
--summerprice:class/price
--summerclass:sid/class
create table summerprice(
class varchar2(20), 
price number
);

Select * 
from summerprice;

create table summerclass(
sid number, 
class varchar2(20)
);

Select * 
from summerclass;

insert into summerprice values('SPRING', 20000);
insert into summerprice values('C++', 15000);
insert into summerprice values('PYTHON', 10000);
insert into summerprice values('JAVA', 25000);

insert into summerclass values(100, 'SPRING');
insert into summerclass values(150, 'C++');
insert into summerclass values(200, 'PYTHON');
insert into summerclass values(250, 'SPRING');

Select price "C++"
from summerprice 
where class='C++';

delete from summerclass 
where sid=150;

Select count(*) 
from summerclass;

update summerprice 
set price=15000 
where class='SPRING';