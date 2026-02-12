# Write your MySQL query statement below
Select tweet_id
From Tweets
Where CHAR_LENGTH(content)>15