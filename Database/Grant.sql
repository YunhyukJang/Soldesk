create user yhguest identified by yhguest;

grant connect, resource to yhguest;

--비밀번호 분실 시
alter user yhguest identified by yhguest;

--madang 계정에서 진행
--yhguest에게 madang database book table의 select 권한을 부여
grant select on book to yhguest;

--yhguest에게 madang database customer table의 select, update 권한을 부여
--단 with grant option과 함께 부여 *부여받은 권한을 양도할 수 있음
grant select, update on customer to yhguest with grant option;

--yhguest 계정에서 진행
grant select on madang.book to hotel; --Error

grant select on madang.customer to hotel;

--hotel 계정에서 진행
Select * 
from madang.book; --Error

Select * 
from madang.customer;

--madang 계정에서 진행
--orders table을 모든 database(사용자)가 select할 수 있도록 권한을 부여
grant select on orders to public;

--권한 회수(revoke)
--yhguest에게 부여되었던 book table의 select 권한 회수
revoke select on book from yhguest;

--yhguest에게 부여되었던 customer table의 select 권한 회수
revoke select on customer from yhguest;

--with grant option 권한까지 회수
revoke select on customer from yhguest cascade constraints;
revoke update on customer from yhguest cascade constraints;

--yhguest 계정에서 진행
Select * 
from madang.book; --Error

Select * 
from madang.customer; --Error

grant select on madang.customer to hr; --Error
grant update on madang.customer to hr; --Error