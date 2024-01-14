// Return a curried version of the function, where any number of parameters should work the same way
// as passing it individually or as a combination of a few of them
// https://leetcode.com/problems/curry

/**
 * @param {Function} fn
 * @return {Function}
 */
var curry = function(fn) {
    const fnArgs = fn.length;
    let allArgs = [];
    return function curried(...args) {
        allArgs.push(...args);
        if (allArgs.length === fnArgs) {
            // console.log('Executing again', ...allArgs);
            const res = fn(...allArgs);
            allArgs = [];
            return res;
        } else {
            return curried;
        }
    }
}

 function sum(a, b) { return a + b; }
 const csum = curry(sum);
//  console.log(csum(1)(2)(3)); // 3
//  console.log(csum(1, 2, 3)); // 3
//  console.log(csum(1, 2)); // 3
 console.log(csum(1)(2)); // 3