/**
LeetCode program to increase so to keep max city sky line
In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there. 
We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings). Height 0 is considered to be a building as well. 

At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and right, must be the same as the skyline of the original grid. 
A city's skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance. See the following example.

What is the maximum total sum that the height of the buildings can be increased?

Example:
Input: grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]
Output: 35
Explanation: 
The grid is:
[ [3, 0, 8, 4], 
  [2, 4, 5, 7],
  [9, 2, 6, 3],
  [0, 3, 1, 0] ]

The skyline viewed from top or bottom is: [9, 4, 8, 7]
The skyline viewed from left or right is: [8, 7, 9, 3]

The grid after increasing the height of buildings without affecting skylines is:

gridNew = [ [8, 4, 8, 7],
            [7, 4, 7, 7],
            [9, 4, 8, 7],
            [3, 3, 3, 3] ]

Notes:

1 < grid.length = grid[0].length <= 50.
All heights grid[i][j] are in the range [0, 100].
All buildings in grid[i][j] occupy the entire grid cell: that is, they are a 1 x 1 x grid[i][j] rectangular prism.
*/

public class KeepCitySkyline {
	
	static int findMaxIncrease(int[][] grid) {
		int rowLen = grid.length;
		int colLen = grid[0].length;
		int[] rowHeights = new int[rowLen];
		int[] colHeights = new int[colLen];
		
		for(int i=0; i<rowLen; i++) {
			int maxRow = grid[i][0];
			for(int j=1; j<colLen; j++) {
			    if(grid[i][j] > maxRow) {
			    		maxRow = grid[i][j];
			    }
			}
			rowHeights[i] = maxRow;
//			System.out.println("The value of the row "+ i + " is "+ rowHeights[i]);
		}
		
		for(int j=0; j<colLen; j++) {
			int maxCol = grid[0][j];
			for(int i=1; i<rowLen; i++) {
			    if(grid[i][j] > maxCol) {
			    		maxCol = grid[i][j];
			    }
			}
			colHeights[j] = maxCol;
//			System.out.println("The value of the col "+ j + " is "+ colHeights[j]);
		}
		
		int count = 0;
		for(int i=0; i<rowLen; i++) {
			for(int j=0; j<colLen; j++) {
//			    System.out.println("The rowHeight value:"+rowHeights[i]+" , the colHeight value:"+colHeights[j]);
//			    System.out.println("The grid value is:"+grid[i][j]);
				int addValue = Math.min(rowHeights[i], colHeights[j]) - grid[i][j];
//			    System.out.println("The add value is:"+addValue);
				count += addValue;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] grids = new int[][] {{3, 0, 8, 4},
            {2, 4, 5, 7},
            {9, 2, 6, 3},
            {0, 3, 1, 0}};
            
		System.out.println("The max increase heights:"+findMaxIncrease(grids));

	}

}
