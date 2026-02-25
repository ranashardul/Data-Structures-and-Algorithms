# Write your MySQL query statement below
Select
    p.project_id,
    ROUND(
        SUM(e.experience_years)/COUNT(e.employee_id),2
    ) as average_years

From Project p LEFT JOIN Employee e
ON p.employee_id = e.employee_id
Group By p.project_id