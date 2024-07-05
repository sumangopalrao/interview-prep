// Problem: Find maximum ascending subarray
// https://leetcode.com/problems/maximum-ascending-subarray-sum/description/
// Runtime: O(n)

function maxAscendingSubArray(nums: number[]): number{
    let maxSumSoFar = 0;

    if (nums.length === 1) 
        return nums[0];
    
    let currentSum = nums[0];
    maxSumSoFar = currentSum;
    
    for(let i=1; i<nums.length; i++) {
        if (nums[i] > nums[i-1]) {
            currentSum += nums[i];
        } else {
            currentSum = nums[i];
        }

        if (currentSum > maxSumSoFar)
            maxSumSoFar = currentSum;
    }

    return maxSumSoFar;
};

console.log(maxAscendingSubArray([10,20,30,5,10,50]));
console.log(maxAscendingSubArray([10,20,30,40,50]));
console.log(maxAscendingSubArray([12,17,15,13,10,11,12]));
console.log(maxAscendingSubArray([1]));
console.log(maxAscendingSubArray([100,10,1]));
