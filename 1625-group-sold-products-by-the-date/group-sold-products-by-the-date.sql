# Write your MySQL query statement below
select sell_date, count(distinct product) AS num_sold , group_concat(distinct product order by product separator ',') AS products
from Activities
group by sell_date
order by sell_date
