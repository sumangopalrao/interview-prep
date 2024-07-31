// Find the number of people who met the target number of hours.
// https://leetcode.com/problems/number-of-employees-who-met-the-target/
function numberOfEmployeesWhoMetTarget(hours: number[], target: number): number {
    let count = 0;

    for(let i=0; i<hours.length; i++) {
        if (hours[i] >= target) {
            count++;
        }
    }

    return count;
};