# Write your MySQL query statement below
select product_id,'store1' AS store, store1 AS price
from Products
where store1 is not null

union all

select product_id,'store2' AS store, store2 AS price
from Products
where store2 is not null

union all

select product_id,'store3' AS store, store3 AS price
from Products
where store3 is not null

order by product_id,store;