// Count negative nubmers in a sorted matrix
// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/

function countNegatives(grid: number[][]): number {
    let count = 0;
    for(let i=0; i<grid.length; i++) {
        for (let j=0; j<grid[0].length; j++) {
            if (grid[i][j] < 0)
                count++;
        }
    }
    return count;
};

console.log(countNegatives([[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]));