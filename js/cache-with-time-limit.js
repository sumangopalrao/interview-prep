// Program to create a cache with time limits
// https://leetcode.com/problems/cache-with-time-limit

var TimeLimitedCache = function() {
    this.map = new Map();
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} duration time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */
TimeLimitedCache.prototype.set = function(key, value, duration) {
    if (this.map.get(key) !== undefined) {
        const existingRef = this.map.get(key).ref;
        clearTimeout(existingRef);
        const newRef = setTimeout(() => {
            this.map.delete(key);
        }, duration);
        this.map.set(key, { value: value, ref: newRef}); 
        return true;
    } else {
        const ref = setTimeout(() => {
            this.map.delete(key);
        }, duration);
        this.map.set(key, { value: value, ref: ref});
        return false;
    }
    
};

/** 
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function(key) {
    if(this.map.has(key)) {
        return this.map.get(key).value;
    }
    return -1;
};

/** 
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function() {
    return this.map.size;
};


const timeLimitedCache = new TimeLimitedCache()
console.log(timeLimitedCache.set(1, 42, 1000)); // false
console.log(timeLimitedCache.get(1)); // 42
console.log(timeLimitedCache.count()); // 1