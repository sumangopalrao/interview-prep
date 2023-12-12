// Write a function create counter that should accept an initial value and return an object that has three functions.
/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    console.log(init);
    const originalValue = init;
    return {
        increment: () => {
            return ++init;
        },
        reset: () => {
            init = originalValue;
            return originalValue;
        },
        decrement: () => {
            return --init;
        },
    }
};


const counter = createCounter(5)
console.log(counter.increment()); // 6
console.log("original", counter.reset()); // 5
console.log(counter.decrement()); // 4
