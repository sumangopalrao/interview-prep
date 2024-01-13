// Program to throttle functions, where initially execute and wait for another call.
// If there is another call while in progress, use the new args and call it again at the end of the initial execution.
// https://leetcode.com/problems/throttle

/**
* @param {Function} fn
* @param {number} t
* @return {Function}
*/
var throttle = function(fn, t) {
    
    let isInProgress = false;
    let oldArgs;
    return function(...args) {
        if (!isInProgress) {
            fn(...args);
            isInProgress = true;
            setTimeout(helper, t);
            // return setTimeout(())
        } else {
            oldArgs = args;
            // setTimeout(() => {
            // isInProgress = false;
            // fn(...oldArgs);
            // }, t);
        }
        
        function helper() {
            if (oldArgs) {
                fn(...oldArgs);
                isInProgress = true;
                oldArgs = undefined;
                setTimeout(helper, t);
            } else {
                isInProgress = false;
            }
        }
    }
};

const throttled = throttle(console.log, 5000);
throttled("log"); // logged immediately.
throttled("log"); // logged at t=100ms.