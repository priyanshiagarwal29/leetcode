# Write your MySQL query statement below
select P.project_id, round(avg(e.experience_years),2)as average_years 
from Project P
Left join Employee e
on P.employee_id=e.employee_id
group by p.project_id;
