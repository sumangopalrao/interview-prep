// Program to create chunks of array based on size
// https://leetcode.com/problems/chunk-array/description

/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    const resArr = [];
    let k = 0;
    while(k < arr.length) {
        const res = []
        let i = 0;
        for(; i<size && i+k < arr.length; i++) {
            res.push(arr[i+k]);
        }
        resArr.push(res);
        k = k + i;
    }
    return resArr;
};
