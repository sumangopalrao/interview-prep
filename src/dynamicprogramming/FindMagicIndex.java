//Given a sorted array find the index i where a[i] = i
//CTCI 8.3

package dynamicprogramming;

public class FindMagicIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{-1, -1, 1, 3, 3, 5};
		for(int i=0; i<a.length; i++) {
			if(a[i] == i)
				System.out.println("Found at "+ i);
		}
		
		System.out.println("The magic index is: "+findIndex(a, 0, a.length-1));
	}
	
	public static int findIndex(int[] arr, int low, int high) {
		int mid = (low+high)/2;
		if(low > high)
			return -1;
		if(arr[mid] == mid) {
			return mid;
		}
		
		int leftSearch = findIndex(arr, low, Math.min(mid-1, arr[mid]));
		if(leftSearch > 0)
			return leftSearch;
		int rightSearch = findIndex(arr, Math.max(mid+1, arr[mid]), high);
		if(rightSearch > 0)
			return rightSearch;
		return -1;
	}
}
