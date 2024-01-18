// Program to convert JSON to JSON string
// https://leetcode.com/problems/convert-object-to-json-string/

/**
 * @param {null|boolean|number|string|Array|Object} object
 * @return {string}
 */
var jsonStringify = function(object) {
    if (object === null || object === undefined)
        return String(object);


    if (Array.isArray(object)) {
        const vals = object.map((obj) => jsonStringify(obj));
        return `[${vals.join(",")}]`;
    }

    if (typeof object === 'object') {
        const keys = Object.keys(object);
        const kValues = keys.map((key) => `${key}:${jsonStringify(object[key])}`);
        return `{${kValues.join(",")}}`;
    }
    

    if (typeof object === 'string') {
        return `"${String(object)}"`;
    }
    
    
    return String(object);
};

console.log(jsonStringify({"y":1,"x":2}));