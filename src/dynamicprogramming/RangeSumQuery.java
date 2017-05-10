//Program from ArdenDertat to find the sum between two row and column in a 2D matrix by caching values.
package dynamicprogramming;

public class RangeSumQuery {
	
	public static class NumMatrix {
	    int[][] sum;

	    public NumMatrix(int[][] matrix) {
	        sum = new int[matrix.length][matrix[0].length];
	        for(int i=0; i<matrix[0].length; i++) {
	            sum[0][i] = matrix[0][i];
	        }
	        for(int j=0; j<matrix[0].length; j++) {
	            for(int i=1; i<matrix.length; i++) {
	                sum[i][j] = sum[i-1][j] + matrix[i][j];
	            }
	        }
	        
	        for(int i=0; i<matrix.length; i++) {
	            for(int j=1; j<matrix[0].length; j++) {
	                sum[i][j] += sum[i][j-1];
	             //   System.out.print(sum[i][j]+",");
	            }
	            //System.out.println();
	        }
	        
	        printMatrix(sum);
	        
	    }
	    
	    public void printMatrix(int[][] matrix) {
	    	for(int i=0; i<matrix.length; i++) {
	    		for(int j=0; j<matrix[0].length; j++) {
	    			System.out.print(matrix[i][j]+",");
	    		}
	    		System.out.println();
	    	}
	    }
	    
	    public int sumRegion(int row1, int col1, int row2, int col2) {
	    	int OA = 0;
	    	int OD = 0;
	    	int OC = 0;
	    	int OB = 0;
	    	if(row1 == 0 || col1 == 0)
	    		OA = 0;
	    	else OA = sum[row1-1][col1-1];
	    	if(col1 == 0) 
	    		OC = 0;
	    	else 
	    		OC = sum[row2][col1-1];
	    	if(row1 == 0) 
	    		OB = 0;
	    	else 
	    		OB = sum[row1-1][col2];
	    	OD = sum[row2][col2];
	        return OD - OB - OC + OA;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][] {
			{3,0,1,4,2},
			{5,6,3,2,1},
			{1,2,0,1,5},
			{4,1,0,1,7},
			{1,0,3,0,5}	
		};
		NumMatrix num = new RangeSumQuery.NumMatrix(matrix);
		System.out.println(num.sumRegion(1,2,2,4));

	}

}
