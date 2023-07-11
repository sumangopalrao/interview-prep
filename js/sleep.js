// Given a time t, write a function that returns a asyn function which sleeps for t milliseconds.
// https://leetcode.com/problems/sleep/description/

/**
 * @param {number} millis
 */
async function sleep(millis) {
    return new Promise(fn => {
        setTimeout(fn, millis);
    }); 
 }
 
 /** 
  * let t = Date.now()
  * sleep(100).then(() => console.log(Date.now() - t)) // 100
  */