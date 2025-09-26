# Write your MySQL query statement below
SELECT country, SUBSTR(trans_date,1,7) AS month, count(id) as trans_count, SUM(CASE WHEN state="approved" then 1 else 0 END) as approved_count, SUM(amount) AS trans_total_amount,  SUM(CASE WHEN state='approved' then amount else 0 END) AS approved_total_amount FROM Transactions
GROUP BY month, country;