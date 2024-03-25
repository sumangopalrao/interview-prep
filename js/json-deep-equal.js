// Program to replicate implementation of JSON Deep Equal
// https://leetcode.com/problems/json-deep-equal

/**
* @param {null|boolean|number|string|Array|Object} o1
* @param {null|boolean|number|string|Array|Object} o2
* @return {boolean}
*/
var areDeeplyEqual = function (o1, o2) {
    if (o1 === null && o2 === null)
        return true;
    if (o1 === null && o2 !== null)
        return false;
    if (o2 === null && o1 !== null)
        return false;
    if (typeof o1 === 'boolean' && typeof o2 === 'boolean')
        return o1 === o2;
    if (!o1 && !o2)
        return true;
    if (!o1)
        return false;
    if (!o2)
        return true
    if (typeof o1 !== 'object' && typeof o2 !== 'object') {
        // console.log('Inside if condition');
        return o1 === o2;
    }


    function isChildrenEqual(o1, o2) {
        const keys = Object.keys(o1);
        if (Object.keys(o1).length !== Object.keys(o2).length)
            return false;
        for (let key of keys) {
            if (Object.hasOwn(o2, key)) {
                if(!areDeeplyEqual(o1[key], o2[key]))
                    return false;
            }
            else {
                return false;
            }
        };
        return true;
    }

    if (Array.isArray(o1) && Array.isArray(o2)) {
        if (o1.length !== o2.length) {
            return false;
        }
        return isChildrenEqual(o1, o2);
    }

    if ((Array.isArray(o1) && !Array.isArray(o2)) || (Array.isArray(o2) && !Array.isArray(o1))) {
        return false;
    }

    return isChildrenEqual(o1, o2); 
};

console.log(areDeeplyEqual({ key: 'value' }, { key: 'value' }));
console.log(areDeeplyEqual({ key: 'value123' }, { key: 'value' }));
console.log(areDeeplyEqual(['value123', 'value'], ['value123', 'value123231']));
console.log(areDeeplyEqual(true, false));
console.log(areDeeplyEqual([1], { "0": 1, "length": 1 }));
console.log(areDeeplyEqual({ "0": 1 }, [1]));
console.log(areDeeplyEqual({}, null));