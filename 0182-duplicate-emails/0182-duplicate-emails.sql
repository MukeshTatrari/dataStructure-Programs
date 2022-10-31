# Write your MySQL query statement below
select Email  from person p group by email having count(*) >1 ;