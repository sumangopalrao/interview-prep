// WAP to replicate a string n times
// https://leetcode.com/problems/repeat-string/

/**
 * @param {number} times
 * @return {string}
 */
String.prototype.replicate = function(times) {
    let str = "";
     for (let i=0; i<times; i++) {
       str += this;
     } 
     return str;
}