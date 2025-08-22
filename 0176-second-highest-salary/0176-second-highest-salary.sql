# Write your MySQL query statement below
#select max(distinct salary) as secondhighestsalary 
#from employee 
#where salary < (select max(salary) from employee);

select(select distinct salary
from Employee
where salary is not null
order by salary desc
limit 1 offset 1) as secondhighestsalary;