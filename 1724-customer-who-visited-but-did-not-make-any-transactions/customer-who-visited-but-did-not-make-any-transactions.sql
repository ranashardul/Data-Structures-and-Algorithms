# Write your MySQL query statement below
Select Visits.customer_id, Count(*) as count_no_trans
From Visits Left Join Transactions
On Visits.visit_id = Transactions.visit_id
Where Transactions.transaction_id IS NULL
Group By Visits.customer_id;