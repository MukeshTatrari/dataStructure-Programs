# Write your MySQL query statement below
select p.firstName ,p.lastName , d.city, d.state     
from person p LEFT JOIN Address d on p.personId  = d.personId ;