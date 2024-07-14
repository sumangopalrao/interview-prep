// https://leetcode.com/problems/sum-of-digits-in-the-minimum-number/description/
// Find the sum of digits in the min number and return 1 or 0 based on if it is even or odd

function sumOfDigits(nums: number[]): number {
    let min = 101;
    let sum = 0;

    for(let i=0; i<nums.length; i++) {
        if (nums[i] < min)
            min = nums[i];
    }

    while(min > 0) {
        let rem = min % 10;
        sum += rem;
        min = Math.floor(min/10);
    }

    if (sum % 2 == 1)
        return 0;

    return 1;
};