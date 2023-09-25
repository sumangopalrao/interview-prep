// Given a function fn and an array args, return a function partialFn that replaces '_'
// https://leetcode.com/problems/partial-function-with-placeholders/description/

/**
 * @param {Function} fn
 * @param {Array} args
 * @return {Function}
 */
var partial = function(fn, args) {
    
    return function(...restArgs) {
        const newArgs = [];
        let i = 0;
        args.forEach(arg => {
            if (arg === '_') {
                newArgs.push(restArgs[i]);
                i++;
            } else {
                newArgs.push(arg);
            }
        });

        while(i < restArgs.length) {
            newArgs.push(restArgs[i]);
            i++;
        }

        return fn(...newArgs);
    }
};