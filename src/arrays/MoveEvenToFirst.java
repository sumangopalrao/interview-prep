//Chapter 6. EPI. 
//Given an array move the even elements to the beginning.
package arrays;

public class MoveEvenToFirst {

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{3, 4, 2, 1, 5};
		int even_length = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0)
				even_length++;
		}
		
		int i=0;
		int j = even_length;
		while(i < even_length && j < arr.length) {
			if(arr[i]%2 == 0) {
				i++;
			}
			else {
				if(arr[j]%2 == 0) {
					swap(arr, i, j);
					i++;
				}
				j++;
			}
		}
		for(int m=0; m<arr.length; m++) {
			System.out.println(arr[m]);
		}
	}

}
