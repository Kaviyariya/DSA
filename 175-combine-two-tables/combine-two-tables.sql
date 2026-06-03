# Write your MySQL query statement below
select p.firstName,p.lastName,a.City,a.State from person p left join address a on a.personid=p.personid;