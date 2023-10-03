// Given an array of promises, resolve all the promises and return another promise with their values.
// https://leetcode.com/problems/parallel-execution-of-promises-for-individual-results-retrieval/

/**
* @param {Array<Function>} functions
* @return {Promise<Array>}
*/
var promiseAllSettled = function(functions) {

    return new Promise((resolve, reject) => {
        const out = [];
        let count = 0;
        functions.forEach((fn, index) => {
            fn().then(val => {
                out[index] = {
                    status: "fulfilled",
                    value: val
                };
                count++;
                if (count === functions.length) {
                    resolve(out);
                }
            }).catch( err => {
                out[index] = {
                    status: "rejected",
                    reason: err
                };
                count++;
                if (count === functions.length) {
                    resolve(out);
                }
            });
        });
    });
}


const functions = [
    () => new Promise(resolve => setTimeout(() => resolve(15), 100))
]
const time = performance.now()

const promise = promiseAllSettled(functions);

promise.then(res => {
    const out = {t: Math.floor(performance.now() - time), values: res}
    console.log(out) // {"t":100,"values":[{"status":"fulfilled","value":15}]}
})