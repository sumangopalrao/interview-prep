// Given a three digit number, find out whether it is a fascinating number.
// A fascinating number is a number that when multiplied by 2 and 3, and both these products are concatenated with the original number, all digits from 1 to 9 are present exactly once, regardless of the number of zeroes.
// https://leetcode.com/problems/check-if-the-number-is-fascinating/description/

/**
 * @param {number} n
 * @return {boolean}
 */
var isFascinating = function(n) {

    let res = '';

    res = n + '' + 2*n + '' + 3*n;

    const vals = [];

    for(let i=0; i<res.length; i++) {

        if (res.charAt(i) == '0') {
            return false;
        }

        console.log('Hello', res.charAt(i));
        if (vals[res.charAt(i)] == true) {
            console.log('char is', res.charAt(i));
            return false; 
        }

        vals[res.charAt(i)] = true;
    }

    console.log(res);

    return true;
    
};


console.log(isFascinating(192)); // true
console.log(isFascinating(267)); // true