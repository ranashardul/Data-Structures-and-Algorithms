# Write your MySQL query statement below
Select id, movie, description, rating
From Cinema
Where id%2=1 AND description<>'boring'
Order By rating DESC