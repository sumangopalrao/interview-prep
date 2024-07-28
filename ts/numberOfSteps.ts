// Find the number of steps, subtract by 1 if odd and divide by 2 if even.
// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/

function numberOfSteps(num: number): number {

    let steps = 0;

    if (num == 0) 
        return  steps;

    while(num !== 0) {
        steps++;
        if (num % 2 == 0) {
            num = num / 2;
        }
        else  {
            num = num - 1;
        }
    }

    return steps;
};