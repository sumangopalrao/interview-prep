// Write a function that returns the name of the method
// https://leetcode.com/problems/infinite-method-object/description/

/**
 * @return {Object}
 */
var createInfiniteObject = function() {
    const handler = {
        get(target, prop, receiver) {
            return () => prop;
        }
    };
    const proxy = new Proxy(this, handler);
    return proxy;
};

/**
 * const obj = createInfiniteObject();
 * obj['abc123'](); // "abc123"
 */