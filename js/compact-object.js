// Program to convert nested objects and arrays with non-defined values to a compact version after cleaning it up
// https://leetcode.com/problems/compact-object

/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
    var compactObject = function(obj) {
        // Base case for non-object or null values
        if (!obj) return false;
        if (typeof obj !== 'object') return obj;
    
        if (Array.isArray(obj)) {
            // Process arrays
            const newArr = [];
            for (let i = 0; i < obj.length; i++) {
                const curr = obj[i];
                const subRes = compactObject(curr); // Recursive call for array elements
    
                if (subRes) {
                    newArr.push(subRes);
                }
            }
            return newArr;
        } else {
            // Process objects
            const newObj = {};
            for (const key in obj) {
                if (obj.hasOwnProperty(key)) {
                    const subRes = compactObject(obj[key]); // Recursive call for object properties
    
                    if (subRes) {
                        newObj[key] = subRes;
                    }
                }
            }
            return newObj;
        }
    };

console.log(compactObject([null, 0, false, 1]));