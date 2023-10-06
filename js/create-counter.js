// Given an integer n, return a counter function. This returns usually in the form of (n, n+1, n+2 ...)
/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    var countValue = n;
    return () => {
        return countValue++;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */