--오손 읽기 uncommitted *오로지 읽기만 가능
--uncommitted를 이용하여 rollback은 인지하도록 처리하고
--오손 읽기를 방지한다.
set transaction isolation 
level read committed;

Select * 
from madang.users 
where id=1;