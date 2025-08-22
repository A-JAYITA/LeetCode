# Write your MySQL query statement below
select *
from Users
where REGEXP_like
(mail,'^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$','c'); 