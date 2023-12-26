// Create a cancellable function that calls `fn` in intervals of `t` and returns the function which can cancel the preivous set function after an arbitrary time.

/**
 * 
 * @param {} fn 
 * @param {*} args 
 * @param {*} t 
 * @returns 
 */
var cancellable = function(fn, args, t) {

    fn(...args);

    const intervalId = setInterval(() => fn(...args), t);

    const cancelFn = () => clearInterval(intervalId);

    return cancelFn;

};