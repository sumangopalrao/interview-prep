//Rotate a nxn matrix by 90 degrees clockwise.
//CTCI 1.7
//Leetcode: Rotate Image
// https://leetcode.com/problems/rotate-image/description/
package arrays;
public class Rotate2DArray {
	
	private static int[][] rotateArray(int[][] arr) {
		if(arr.length == 0)
			return arr;
		int k = 0; 
		int n = arr.length;
		while(k < n/2) {
			for(int i=k; i<n-1-k; i++) {
				int temp = arr[k][i];
				arr[k][i] = arr[n-1-i][k];
				arr[n-1-i][k] = arr[n-k-1][n-1-i];
				arr[n-k-1][n-1-i] = arr[i][n-k-1];
				arr[i][n-1-k] = temp;
			}
			k++;
		}
		return arr;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		System.out.println("Before:");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[0].length; j++) {
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
		int[][] out = rotateArray(arr1);
		System.out.println("After:");
		for(int i=0; i<out.length; i++) {
			for(int j=0; j<out[0].length; j++) {
				System.out.print(out[i][j]);
			}
			System.out.println();
		}
	}
}
