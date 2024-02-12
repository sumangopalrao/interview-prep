// Given a sequence of operations, `ops` which increments the values within its indices. 
// Return the max count of the maximum number
// https://leetcode.com/problems/range-addition-ii/

function maxCount(m: number, n: number, ops: number[][]): number {


    let minX = m;
    let minY = n;
    ops.forEach(op => {
        minX = Math.min(minX, op[0]);
        minY = Math.min(minY, op[1]);
    });

    return minX * minY

    // let maxSoFar = 0;
    // let maxCount = 0;

    // const matrix: number[][] = [];
    // for (let i=0; i<m; i++) {
    //     matrix[i] = [];
    //     for (let j=0; j<m; j++) {
    //         matrix[i][j] = 0;
    //     }
    // }


    // for(let k=0; k<ops.length; k++) {
    //     for (let i=0; i<ops[k][0]; i++) {
    //         for (let j=0; j<ops[k][1]; j++) {
    //             matrix[i][j]++;
    //             if (matrix[i][j] > maxSoFar) {
    //                 maxSoFar = matrix[i][j];
    //             }
    //         }
    //     }
    // }
    
    // for (let i=0; i<m; i++) {
    //     for (let j=0; j<n; j++) {
    //         if(matrix[i][j] === maxSoFar) {
    //             maxCount++;
    //         }
    //     }
    // }

    // return maxCount;
};