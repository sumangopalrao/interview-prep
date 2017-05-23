//Program to print the output of a 2D array in a spiral order. 
package arrays;

public class Spiral2DArray {
	
	private static void printSquare(int[][] arr, int start, int end) {
		for(int j=start; j<end; j++) {
			System.out.println(arr[start][j]);
		}
		for(int i=start; i<end; i++) {
			System.out.println(arr[i][end]);
		}
		for(int j=end; j>start; j--) {
			System.out.println(arr[end][j]);
		}
		for(int i=end; i>start; i--) {
			System.out.println(arr[i][start]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int start = 0;
		int end = arr.length - 1;
		while(start < end) {
			printSquare(arr, start++, end--);
		}
		if(start == end)
			System.out.println(arr[start][end]);
	}

}
