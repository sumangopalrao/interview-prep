// Program to execute functions paralelly
// https://leetcode.com/problems/execute-asynchronous-functions-in-parallel

/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
var promiseAll = function(functions) {

    return new Promise((resolve, reject) => {
        const resArray = [];
        let resolvedCount = 0;
        functions.forEach((func, index) => {
            func().then((res) => {
                resArray[index] = res;
                resolvedCount++;
                if (resolvedCount === functions.length)
                    resolve(resArray);
            }).catch((err) => reject(err));;
        });
    })
    
};

const promise = promiseAll([() => new Promise(res => res(42))])
promise.then(console.log); // [42]
