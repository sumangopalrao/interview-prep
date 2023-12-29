// Program to sort by based on the output of a function
// https://leetcode.com/problems/sort-by/description

/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
var sortBy = function(arr, fn) {
    return arr.sort((val1, val2) => {
        return fn(val1) - fn(val2);
    });
}
