// WAP to perform array reduce transformation without using the in build `reduce` function
// https://leetcode.com/problems/array-reduce-transformation/description

/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let res = init;
    for(let i=0; i<nums.length; i++) {
        res = fn(res, nums[i]);
    }
    return res;
};