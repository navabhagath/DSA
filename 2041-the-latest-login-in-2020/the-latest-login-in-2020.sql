# Write your MySQL query statement below
SELECT l.user_id , l.time_stamp AS last_stamp
FROM Logins l
JOIN (
    SELECT user_id, MAX(time_stamp) AS current
    FROM Logins
    WHERE YEAR(time_stamp) = 2020
    GROUP BY user_id
) t
ON l.user_id = t.user_id
AND l.time_stamp = t.current

