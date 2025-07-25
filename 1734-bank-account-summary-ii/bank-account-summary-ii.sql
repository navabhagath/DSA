# Write your MySQL query statement below
select u.name,sum(t.amount) AS balance
from Users u 
left join Transactions t on u.account = t.account
group by u.account
having balance > 10000;