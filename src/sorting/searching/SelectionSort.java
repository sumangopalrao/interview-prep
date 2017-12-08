package sorting.searching;

public class SelectionSort {
	
	public static int[] sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int lowest = arr[i];
			int lowestIndex = i;
			for(int j=i; j<arr.length; j++) {
				if(arr[j] < lowest) {
					lowest = arr[j];
					lowestIndex = j;
				}
			}
			swap(arr, i, lowestIndex);
		}
		return arr;
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
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
