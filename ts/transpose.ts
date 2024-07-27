// Return the transpose of a matrix
// https://leetcode.com/problems/transpose-matrix/description/

function transpose(matrix: number[][]): number[][] {
    const res: number[][] = [];
    for(let i=0; i<matrix[0].length; i++) {
        res[i] = [];
    }
    for(let i=0; i<matrix.length; i++) {
        for(let j=0; j<matrix[i].length; j++) {
            res[j][i] = matrix[i][j];
        }
    }
    return res;
};

console.log(transpose([[1,2,3],[4,5,6],[7,8,9]]));