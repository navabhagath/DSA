# Write your MySQL query statement below
select score,dense_rank() over (order by score desc) AS 'rank'
from Scores
order by score desc