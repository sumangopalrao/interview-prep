// Program to merge two arrays by id
// https://leetcode.com/problems/join-two-arrays-by-id

/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {

    const merged = {};

    // Process the first array (arr1)
    arr1.forEach(obj => {
        merged[obj.id] = {...obj};
    });

    // Process the second array (arr2)
    arr2.forEach(obj => {
        if (merged[obj.id]) {
            // Merge with existing object, giving priority to arr2
            merged[obj.id] = {...merged[obj.id], ...obj};
        } else {
            merged[obj.id] = {...obj};
        }
    });

    // Form the joined array and sort based on the id
    const joinedArray = Object.values(merged).sort((a, b) => a.id - b.id);

    return joinedArray;
    
};