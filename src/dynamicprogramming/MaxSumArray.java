//ArdenDertat find coniguous longest sum array
package dynamicprogramming;

public class MaxSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		int sum = arr[0];
		int maxSum = arr[0];
		for(int i=1; i<arr.length; i++) {
			sum = Math.max(sum+arr[i], arr[i]);
			maxSum = Math.max(sum, maxSum);
		}
		System.out.println(maxSum);
	}

}
