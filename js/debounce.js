// Program to recreate debounce function
// https://leetcode.com/problems/debounce

/**
 * @param {Function} fn
 * @param {number} t milliseconds
 * @return {Function}
 */
var debounce = function(fn, t) {
    
    const scheduled = [];
    return function(...args) {
        for(const timeoutItem of scheduled) {
            clearTimeout(timeoutItem);
        }
        const timer1 = setTimeout(() => {
            fn(...args);
        }, t);
        scheduled.push(timer1);
    }
};

/**
 * const log = debounce(console.log, 100);
 * log('Hello'); // cancelled
 * log('Hello'); // cancelled
 * log('Hello'); // Logged at t=100ms
 */