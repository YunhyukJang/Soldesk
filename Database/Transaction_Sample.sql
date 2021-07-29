set transaction name 'T2';

update madang.book 
set price=price*1.1 
where bookid=2;

update madang.book 
set price=price*1.1 
where bookid=1;

Select * 
from madang.book 
where bookid=2;

commit;

Select * 
from madang.users;