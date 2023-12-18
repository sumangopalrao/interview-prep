// Given a function, create a function that returns the memoized version of that function.
// https://leetcode.com/problems/memoize

/**
 * @param {Function} fn
 * @return {Function}
 */
function memoize(fn) {
    const map = new Map();
    
    return function(...args) {
        if (map.has(JSON.stringify(args))) {
            return map.get(JSON.stringify(args));
        }
        const res = fn(...args);
        map.set(JSON.stringify(args), res);
        return res;
    }
}

 let callCount = 0;
 const memoizedFn = memoize(function (a, b) {
  callCount += 1;
   return a + b;
 })
 console.log(memoizedFn(2, 3)) // 5
 memoizedFn(2, 3) // 5
 console.log(callCount) // 1 