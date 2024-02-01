// Given a pool of promises, only resolve n of them at a time and return the result of all of them together
// https://leetcode.com/problems/promise-pool

/**
* @param {Function[]} functions
* @param {number} n
* @return {Promise<any>}
*/
var promisePool = async function(functions, n) {
    
    const results = [];
    
    return new Promise((res, err) => {
        let i = 0;
        let numberOfPromisesPending = 0;
        
        console.log('Functions are', functions);
        
        function cb() {
            if (i === functions.length && numberOfPromisesPending === 0) {
                res();
            }
            while(i< functions.length && numberOfPromisesPending < n) {
                functions[i]().then(() => {
                    numberOfPromisesPending--;
                    cb();
                });
                i++;
                numberOfPromisesPending++;
            }
        }
        cb();
    });
}

const sleep = (t) => new Promise(res => setTimeout(res, t));
promisePool([() => sleep(500), () => sleep(400)], 1)
.then(console.log) // After 900ms