--원본 테이블
drop table BOOKS;

create table BOOKS(
id number primary key, 
name varchar2(20) not null, 
writer varchar2(20) not null, 
price number(10, 2) default 0, 
genre varchar2(20) not null, 
publisher varchar2(20) not null, 
cnt number(10) default 0
);

insert into books(id, name, writer, price, genre, publisher) 
values (books_seqid.nextval, '홍길동전', '허균', 300, '소설', '허균 출판사');
insert into books(id, name, writer, price, genre, publisher) 
values (books_seqid.nextval, '레미제라블', '빅토르 위고', 900, '소설', '빅토르 출판사');

Select * 
from BOOKS;

drop table BOOKS_BACK;

create table BOOKS_BACK(
id number primary key, 
name varchar2(20) not null, 
writer varchar2(20) not null, 
price number(10, 2) default 0, 
genre varchar2(20) not null, 
publisher varchar2(20) not null, 
cnt number(10) default 0
);

Select * 
from BOOKS_BACK;

--sequence
create sequence books_seqid 
increment by 1;

--백업 프로시저 생성
create or replace procedure pro_backup_book(
book_id in books.id%type --books 테이블의 id와 같은 컬럼 타입(외부값을 받는 값)
)
as 
cursor books_cursor is select id, name, writer, price, genre, publisher, cnt 
from books 
where book_id=id; 
b_id books.id%type; 
b_name books.name%type; 
b_writer books.writer%type; 
b_price books.price%type; 
b_genre books.genre%type; 
b_publisher books.publisher%type; 
b_cnt books.cnt%type; 
begin 
open books_cursor; 
loop 
fetch books_cursor into b_id, b_name, b_writer, b_price, b_genre, b_publisher, b_cnt; 
exit when books_cursor%notfound;
insert into books_back(id, name, writer, price, genre, publisher, cnt) 
values(b_id, b_name, b_writer, b_price, b_genre, b_publisher, b_cnt); 
commit; 
end loop; 
close books_cursor; 
end;
/

exec pro_backup_book(1);
exec pro_backup_book(2);