# Write your MySQL query statement below
select P.firstName,P.lastName,A.city,A.state 
from Person P
Left JOIN Address A
on P.personId=A.personId;