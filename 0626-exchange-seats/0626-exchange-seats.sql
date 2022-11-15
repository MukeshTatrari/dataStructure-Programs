# Write your MySQL query statement below
select 
Case
    When id%2 = 1 and id != (select count(id) from seat) then id+1
    When id%2 = 0 then id-1
    ELSE id
END as id, student
  student from Seat 
  order by id asc;