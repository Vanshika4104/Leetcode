# Write your MySQL query statement below
SELECT r.contest_id, ROUND( COUNT(user_id) *100/ (SELECT COUNT(user_id ) FROM USERS),2) AS percentage FROM Register r
GROUP BY r.contest_id
ORDER BY percentage DESC, r.contest_id ASC;