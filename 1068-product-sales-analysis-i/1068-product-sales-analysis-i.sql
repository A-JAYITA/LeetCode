# Write your MySQL query statement below
SELECT product_name ,year,price 
FROM sales S
LEFT JOIN Product P
ON S.product_id = P.product_id;