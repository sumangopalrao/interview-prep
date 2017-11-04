//LeetCode: Program to move 0s to the end of the array.
package arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1, 2, 0, 0, 4, 0, 5};
		
		int index = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                // swap(i, index);
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
		
		for(Integer i:arr) {
			System.out.println(i);
		}
		
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}