create sequence board_seq 
start with 1 
increment by 1 
minvalue 1 
maxvalue 1000;

drop table board;

create table board(
num number not null primary key, 
writer varchar2(20) not null, 
email varchar2(50) not null, 
subject varchar2(50) not null, 
password varchar2(10) not null, 
reg_date date, 
ref number not null, 
re_step number not null, 
re_level number not null, 
readcount number not null, 
contents varchar2(50) not null
);

Select * 
from board;