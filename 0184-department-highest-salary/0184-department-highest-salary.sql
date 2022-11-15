# Write your MySQL query statement below
SELECT    d.name AS DEPARTMENT , 
          e.name AS EMPLOYEE , 
		  e.salary
     FROM EMPLOYEE e, 
				   DEPARTMENT d
				   where e.departmentId = d.id
     and e.salary = ( SELECT MAX(salary) 
                                 FROM EMPLOYEE
                                 WHERE departmentID = e.departmentID);