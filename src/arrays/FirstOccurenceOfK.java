//Program to search sorted array for first occurence of k.
//C12.1 EPI
package arrays;

public class FirstOccurenceOfK {
	
	private static int firstIndex(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = high - (high-low)/2;
			if((arr[mid] == key && mid == 0) || (arr[mid] == key && arr[mid-1] != key))
				return mid;
			if(arr[mid] == key || arr[mid] > key)
				high = mid-1;
			if(arr[mid] < key)
				low = mid+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstIndex(new int[]{3, 3, 3, 3, 3, 3, 4, 5}, 3));
	}

}
