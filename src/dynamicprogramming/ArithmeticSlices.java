package dynamicprogramming;

public class ArithmeticSlices {
	
	static int slices(int[] arr) {
		int[] count = new int[arr.length+1];
		count[0] = 0;
		count[1] = 0;
		
		checkSlice(arr, 2);
		
		return 1;
	}
	
	static boolean checkSlice(int[] arr, int k) {
		if((arr[k] - arr[k-1]) == (arr[k-1]-arr[k-2])) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(slices(new int[]{1, 2, 3, 4}));
	}
}
