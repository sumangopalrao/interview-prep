// Program to flatten a nested array
// https://leetcode.com/problems/flatten-deeply-nested-array

/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {

    if (n === 0) 
        return arr;

    const res = [];

    // function flattenArray(arr, currDepth, maxDepth) {
        for (const elem of arr) {
            if (Array.isArray(elem)) {
                res.push(...flat(elem, n -1));
            }
            else {
                res.push(elem);
            }
        }
    // }
// 
    // return flattenArray(arr, 0, n);
    return res;
};

