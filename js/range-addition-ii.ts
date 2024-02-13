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
};