# Write your MySQL query statement below
select S.student_id,S.student_name,S2.subject_name,  count(e.subject_name)as attended_exams
from Students S
cross join  Subjects S2
left join Examinations e
on S.student_id=e.student_id and S2.subject_name=e.subject_name
group by student_id,student_name,subject_name
order by student_id,subject_name Asc;