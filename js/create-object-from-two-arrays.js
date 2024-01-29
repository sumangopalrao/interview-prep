// WAP to convert two arrays into a key value pair
// https://leetcode.com/problems/create-object-from-two-arrays

/**
 * @param {Array} keysArr
 * @param {Array} valuesArr
 * @return {Object}
 */
var createObject = function(keysArr, valuesArr) {

    const obj = {};
    keysArr.map((value, index) => {
        const key = String(value);
        if (!obj.hasOwnProperty(key)) {
            obj[key] = valuesArr[index];
        }
    })

    return obj;
    
};


console.log(createObject(["a","b","c"], [1,2,3]));