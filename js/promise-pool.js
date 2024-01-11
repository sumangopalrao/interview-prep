// Given a pool of promises, only resolve n of them at a time and return the result of all of them together
// https://leetcode.com/problems/promise-pool

/**
 * @param {Function[]} functions
 * @param {number} n
 * @return {Promise<any>}
 */
var promisePool = async function(functions, n) {

    const results = [];
    let i = 0;
    console.log('Functions are', functions);
    const isPromisePendin = false;
    while(i<n) {
        console.log('Function is', functions[i]);
        const exectutedValue = functions[i]();
        console.log("executed value is", exectutedValue);
        functions[i]().then((res) => {
            console.log("result is", res);
            results.push(res);
        });
        i++;
    }

    return new Promise((res, err) => {
        res(results);
    });
    
};


const sleep = (t) => new Promise(res => setTimeout(res, t));
promisePool([() => sleep(500), () => sleep(400)], 1)
.then(console.log) // After 900ms