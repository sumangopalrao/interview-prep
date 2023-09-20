// WAP to replicate a string n times
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