# Write your MySQL query statement below
select email as Email  from person p group by email having count(*) >1 ;