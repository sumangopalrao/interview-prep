// Find the lucky numbers in the matrix. A lucky number is a number that is the minimum in its row and maximum in its column.
// https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/

package arrays;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {
    public static void main(String[] args) {
        int[][] matrix = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
        List<Integer> res = luckyNumbers(matrix);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
    
    private static List<Integer> luckyNumbers(int[][] matrix) {
        
        int[] rowMin = new int[matrix.length];
        int[] colMax = new int[matrix[0].length];
        List<Integer> luckyIntegers = new ArrayList<>();
        
        for(int i=0; i<matrix.length; i++) {
            Integer rowMinValue = Integer.MAX_VALUE;
            for(int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] < rowMinValue) {
                    rowMinValue = matrix[i][j];
                }
            }
            rowMin[i] = rowMinValue;
        }
        
        for(int j=0; j<matrix[0].length; j++) {
            Integer colMaxValue = Integer.MIN_VALUE;
            for(int i=0; i<matrix.length; i++) {
                if (matrix[i][j] > colMaxValue) {
                    colMaxValue = matrix[i][j];
                }
            }
            colMax[j] = colMaxValue;
        }
        
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    luckyIntegers.add(matrix[i][j]);
                }
            }
        }
        return luckyIntegers;
    }
}
