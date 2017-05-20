package sorting;

public class MergeSort {

	public static int[] sort(int[] arr) {
		mergeSortHelper(arr, 0, arr.length-1);
		return arr;
	}
	
	private static void mergeSortHelper(int[] arr, int start, int end) {
		int[] helper = new int[arr.length];
		if(start < end) {
			int mid = (start+end)/2;
			mergeSortHelper(arr, start, mid);
			mergeSortHelper(arr, mid+1, end);
			merge(arr, helper, start, mid, end);
		}
	}
	
	private static void merge(int[] arr, int[] helper, int start, int mid, int end) {
		for(int i=start; i<=end; i++) {
			helper[i] = arr[i];
		}
		int lstart = start;
		int rstart = mid+1;	
		int j=start;
		while(lstart <= mid && rstart <= end) {
			if(helper[lstart] < helper[rstart]) {
				arr[j] = helper[lstart];
				lstart++;
			}
			else {
				arr[j] = helper[rstart];
				rstart++;
			}
			j++;
		}
		while(lstart <= mid) {
			arr[j] = helper[lstart];
			j++;
			lstart++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{3, 4, 2, 1, 5};
		int[] out = sort(arr);
		for(Integer i: out) {
			System.out.println(i+",");
		}
	}
}
