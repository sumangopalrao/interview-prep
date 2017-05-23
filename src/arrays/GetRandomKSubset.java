//Program when given an array, obtain a subset of values of length k which are random. 
//EPI 6.11
package arrays;

import java.util.Random;

public class GetRandomKSubset {
	
	private static int[] getSubset(int[] arr, int k) {
		
		int i = 0;
		while(i < k) {
			Random r = new Random();
			int j = r.nextInt(arr.length);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] out = getSubset(new int[]{2, 3, 4, 1, 5, 6, 8}, 3);
		for(Integer i : out) {
			System.out.println(i
					+",");
		}
	}

}
