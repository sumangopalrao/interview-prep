//6.1 EPI Rearrange based on pivot value.
package arrays;

public class RearrangeByPivot {
	
	private static int[] rearrange(int[] arr, int pivot) {
		int val = arr[pivot];
		int low = 0;
		int high = arr.length - 1;
		int equal = 0;
		
		while(equal <= high) {
			if(arr[equal] < val) {
				swap(arr, low, equal);
				equal++;
				low++;
			}
			else if(arr[equal] == val) {
				equal++;
			}
			else if(arr[equal] > val) {
				swap(arr, equal, high);
				high--;
			}
		}
		return arr;
	}
	
	
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{4, 5, 3, 2, 1};
		int pivot = 0;
		int[] out = rearrange(arr, pivot);
		for(Integer i:out) {
			System.out.println(i+",");
		}
	}
}
