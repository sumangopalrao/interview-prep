// Program to convert array to group by based on the return value from the function
// https://leetcode.com/problems/group-by 

/**
 * @param {Function} fn
 * @return {Object}
 */
Array.prototype.groupBy = function(fn) {
    const res = {};
    for(let i=0; i<this.length; i++) {
        const fnRes = fn(this[i]);
        if (res.hasOwnProperty(fnRes)) {
            res[fnRes].push(this[i]);
        } else {
            res[fnRes] = [this[i]];
        }
    }
    return res;
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */