package sorting;

public class BubbleSort {

	public static int[] sort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
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
