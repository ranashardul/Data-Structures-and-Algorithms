# Write your MySQL query statement below
Select DISTINCT(author_id) as id
From Views
Where author_id=viewer_id
Order by author_id