# Write your MySQL query statement below
SELECT    D.name AS DEPARTMENT , 
          E.name AS EMPLOYEE , 
		  E.salary
     FROM EMPLOYEE AS E 
	               JOIN 
				   DEPARTMENT AS D 
				   ON E.departmentId = D.id
     WHERE E.salary =   ( SELECT MAX(salary) # this subquery gives max salary  of an department so that we can generate all employees who have max salary in that department.
                                 FROM EMPLOYEE
                                 WHERE departmentID = E.departmentID);