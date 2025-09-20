# Write your MySQL query statement below
select p.product_id, 
    ifnull(
        round(sum(if(u.purchase_date >= p.start_date and u.purchase_date<=p.end_date,p.price * u.units,0)) /
        sum(if(u.purchase_date >= p.start_date and u.purchase_date<=p.end_date,u.units,0)) 
        ,2),
        0) as 'average_price'
from Prices p
left join UnitsSold u
on p.product_id = u.product_id
group by p.product_id