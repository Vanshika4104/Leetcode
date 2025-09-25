# Write your MySQL query statement below
SELECT query_name, ROUND(AVG(rating/position),2) AS quality , 
IFNULL(ROUND(AVG(rating <3)*100, 2),0) AS poor_query_percentage
FROM Queries
GROUP BY query_name;