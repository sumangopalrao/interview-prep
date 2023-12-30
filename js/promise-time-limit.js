// Program to return a time limited version of the asynchronous version.
// https://leetcode.com/problems/promise-time-limit

/**
 * @param {Function} fn
 * @param {number} t
 * @return {Function}
 */
var timeLimit = function(fn, t) {
    
    return async function(...args) {
        // const startTime = Date.now();
        // const promise = await fn(...args);
        // const endTime = Date.now();
        // console.log("Difference", endTime - startTime); 

        // if (endTime - startTime < t) {
        //     return promise.resolve();
        // } else {
        //     return new Error("Time Limit Exceeded");
        // }

        return new Promise((resolve, reject) => {
            setTimeout(() => reject("Time Limit Exceeded"), t);

            fn(...args).then((res) => resolve(res)).catch((err) => reject(err));
        });
    }
};

/**
 * const limited = timeLimit((t) => new Promise(res => setTimeout(res, t)), 100);
 * limited(150).catch(console.log) // "Time Limit Exceeded" at t=100ms
 */