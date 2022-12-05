-- Leetcode: https://leetcode.com/problems/find-total-time-spent-by-each-employee/ 
-- Find the total time an employee spends in office by event day

# Write your MySQL query statement below
select event_day as day, emp_id, sum(out_time - in_time) as total_time from Employees group by 1, 2