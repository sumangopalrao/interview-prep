/**
 * @return {Object}
 */
var createInfiniteObject = function() {
    const handler = {
        get(_, prop) {
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