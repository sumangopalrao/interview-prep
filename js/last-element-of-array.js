// Add function to print the last element of an array
// https://leetcode.com/problems/array-prototype-last/description/

Array.prototype.last = function() {
    if (this.length === 0) {
        return -1;
    }
    return this[this.length - 1];
};

const arr = [1, 2, 3];
arr.last();
