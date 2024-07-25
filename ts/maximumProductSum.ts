// Program to find the maximum three numbers of array whose product is the highest
// https://leetcode.com/problems/maximum-product-of-three-numbers/description/
// Runtime: O(n)

function maximumProduct(nums: number[]): number {
    nums.sort((a, b) => (a - b));
    return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
};