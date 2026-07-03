# Write your MySQL query statement below
SELECT DISTINCT product_id 
from Products
WHERE low_fats = 'Y'
AND recyclable = 'Y';