# Write your MySQL query statement below
select d.name As 'Department' , e.name as 'Employee' , e.salary AS 'Salary'
from Employee e
join Department d
on e.departmentid = d.id
where e.salary = (select max(salary)
                    from Employee
                    where departmentid = e.departmentid)