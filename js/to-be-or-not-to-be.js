// Write a function that checks if two values are equal or not equal and throws errors for the opposite cases.
// https://leetcode.com/problems/to-be-or-not-to-be/

/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
    return {
        "toBe": (val1) => {
            if (val1 === val) {
                return true;
            } else {
                throw new Error("Not Equal");
            }
        },
        "notToBe": (val1) => {
            if (val1 !== val) {
                return true;
            } else {
                throw new Error("Equal");
            }
        }
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */