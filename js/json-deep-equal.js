/**
 * @param {null|boolean|number|string|Array|Object} o1
 * @param {null|boolean|number|string|Array|Object} o2
 * @return {boolean}
 */
var areDeeplyEqual = function(o1, o2) {
    if(typeof o1 !== 'object' && typeof o2 !== 'object') {
        return o1 === o2;
    }
    if (o1.length !== )
    return false;
};

console.log('Boolean is', areDeeplyEqual(1, 2));
console.log(typeof [1, 2, 3]);
console.log(typeof { 'key': 1, 'val': 3});