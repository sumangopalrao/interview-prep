// Write an array wrapper that adds two objects or converts them to a comma separated string
// https://leetcode.com/problems/array-wrapper/description/

/**
 * @param {number[]} nums
 */
var ArrayWrapper = function(nums) {
    this.nums = nums;
};

ArrayWrapper.prototype.valueOf = function() {
    let sum = 0;
    for (let i=0; i<this.nums.length; i++) {
        sum += this.nums[i];
    }
    return sum;
}

ArrayWrapper.prototype.toString = function() {
    let res = "";
    for (let i=0; i<this.nums.length; i++) {
        res += this.nums[i] + ",";
    }
    return "[" + res.slice(0, res.length - 1) + "]";
}

/**
 * const obj1 = new ArrayWrapper([1,2]);
 * const obj2 = new ArrayWrapper([3,4]);
 * obj1 + obj2; // 10
 * String(obj1); // "[1,2]"
 * String(obj2); // "[3,4]"
 */