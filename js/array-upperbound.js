/** 
 * @param {number} target
 * @return {number}
 */
Array.prototype.upperBound = function(target) {
    let left = 0;
    let right = this.length - 1;
    let resIndex = -1;
    while (left <= right) {
        let mid = Math.floor(( left + (right-left) / 2));
        console.log('Mid is', mid);
        if (this[mid] === target) {
            console.log('Target is', mid);
            resIndex = mid;
            left = mid+1;
            // break;
        }
        else if (this[mid] < target) {
            console.log('Left is', left);
            left = mid+1;
        }
        else {
            console.log('Right is', mid);
            right = mid - 1;
        }
    }
    
    return resIndex;
};


console.log([3,4,5].upperBound(5)); // 2
console.log([1,4,5].upperBound(2)); // -1
console.log([3,4,6,6,6,6,7].upperBound(6)) // 5