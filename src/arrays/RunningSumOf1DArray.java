//Leetcode:: Running sum of 1D Array

package arrays;

import java.util.Arrays;

public class RunningSumOf1DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {3,1,2,10,1};
		System.out.println(Arrays.toString(runningSum(input)));

	}
	
	public static int[] runningSum(int[] num) {
		int[] res = new int[num.length];
		res[0] = num[0];
		int prev = num[0];
		for(int i=1; i< num.length; i++) {
			res[i] = num[i] + prev;
			prev = res[i];
		}
		return res;
	}
}
