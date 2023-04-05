//Program to print the output of a 2D array in a spiral order. 
package arrays;

import java.util.ArrayList;
import java.util.List;

public class Spiral2DArray {
	
	public static List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> res = new ArrayList<Integer>();
        if(matrix.length == 0 && matrix[0].length == 0)
            return res;

        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
        int dir = 0;
        
        while(rowStart <= rowEnd && colStart <= colEnd) {
            if(dir == 0) {
                for(int j=colStart; j<=colEnd; j++) {
                    res.add(matrix[rowStart][j]);
                }
                rowStart++;
            }
            else if(dir == 1) {
                for(int i=rowStart; i<=rowEnd; i++) {
                    res.add(matrix[i][colEnd]);
                }
                colEnd--;
            }
            else if(dir == 2) {
                for(int j=colEnd; j>=colStart; j--) {
                    res.add(matrix[rowEnd][j]);
                }
                rowEnd--;
            }
            else if(dir == 3) {
                for(int i=rowEnd; i>=rowStart; i--) {
                    res.add(matrix[i][colStart]);
                }
                colStart++;
            }
            dir = (dir + 1) % 4;
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		List<Integer> out = spiralOrder(arr);
		for(Integer i : out) {
			System.out.println(i);
		}
			
	}

}
