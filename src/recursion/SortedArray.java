package recursion;

public class SortedArray {
	
	static boolean isSorted(int[] arr, int start) {
		if(start == arr.length-1)
			return true;
		if(arr[start] > arr[start+1])
			return false;
		return isSorted(arr, start+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{1};
		System.out.println(isSorted(arr, 0));
	}

}
