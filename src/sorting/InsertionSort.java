//Program to perform insertion sort.
package sorting;

public class InsertionSort {

	public static int[] sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int val = arr[i];
			for(int j=0; j<i; j++) {
				if(val <  arr[j]) {
					System.arraycopy(arr, j, arr, j+1, i-j);
					arr[j] = val;
					break;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{3, 4, 2, 1, 5, -1, -2, -100, -34, -22};
		int[] out = sort(arr);
		for(Integer i: out) {
			System.out.println(i+",");
		}
	}
}
