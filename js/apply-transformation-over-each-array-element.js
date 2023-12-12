// WAP that implements a map kinda function on an array
// https://leetcode.com/problems/apply-transform-over-each-element-in-array/description/

/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    const result = [];
    for (let index = 0; index < arr.length; index++) {
        result.push(fn(arr[index], index));
    }
    return result;
};