--isolation이 가장 강함
set transaction isolation 
level serializable;

--step 1
Select sum(price) 총액 
from book;

--step 3
Select sum(price) 총액 
from book;

Select * 
from book;

commit;