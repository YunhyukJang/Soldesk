/*
극장(극장번호, 극장이름, 위치)
상영관(극장번호, 상영관번호, 영화제목, 가격, 좌석수)
예약(극장번호, 상영관번호, 고객번호, 좌석번호, 날짜)
고객(고객번호, 이름, 주소)

primary key
극장:극장번호
상영관:상영관번호
예약:좌석번호
고객:고객번호

foreign key
상영관:극장(극장번호)
예약:극장(극장번호), 상영관(상영관번호), 고객(고객번호)
*/

--극장 table 생성
drop table 극장;

create table 극장(
극장번호 number(10), 
극장이름 varchar2(40), 
위치 varchar2(40)
);

alter table 극장 add primary key(극장번호);

select * 
from 극장;

--상영관 table 생성
drop table 상영관;

create table 상영관(
극장번호 number(10), 
상영관번호 number(10), 
영화제목 varchar(40), 
가격 number(10), 
좌석수 number(10)
);

alter table 상영관 add primary key(상영관번호);
alter table 상영관 add constraint 상영관_극장_fk foreign key(극장번호) references 극장(극장번호);

select * 
from 상영관;

--예약 table 생성
drop table 예약;

create table 예약(
극장번호 number(10), 
상영관번호 number(10), 
고객번호 number(10), 
좌석번호 number(10), 
날짜 date
);

alter table 예약 add primary key(좌석번호);
alter table 예약 add constraint 예약_극장_fk foreign key(극장번호) references 극장(극장번호);
alter table 예약 add constraint 예약_상영관_fk foreign key(상영관번호) references 상영관(상영관번호);
alter table 예약 add constraint 예약_고객_fk foreign key(고객번호) references 고객(고객번호);

select * 
from 예약;

--고객 table 생성
drop table 고객;

create table 고객(
고객번호 number(10), 
이름 varchar2(40), 
주소 varchar2(40)
);

alter table 고객 add primary key(고객번호);

select * 
from 고객;