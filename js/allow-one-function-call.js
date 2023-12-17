// Program to ensure the function is called only once
// https://leetcode.com/problems/allow-one-function-call

/**
* @param {Function} fn
* @return {Function}
*/
var once = function(fn) {
    var i = 0;
    return function(...args){
        i++;
        if (i == 1) {
            return fn(...args);
        }
        return;
    }
};

/**
* let fn = (a,b,c) => (a + b + c)
* let onceFn = once(fn)
*
* onceFn(1,2,3); // 6
* onceFn(2,3,6); // returns undefined without calling fn
*/

