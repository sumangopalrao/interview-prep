//Leetcode 1470
//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
package arrays;

import java.util.Arrays;

public class ShuffleTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,1,2,2};
		System.out.println(Arrays.toString(shuffle(input, 2)));
	}
	
	public static int[] shuffle(int[] nums, int n) {
		int[] res = new int[2*n];
		int j = 0;
		for(int i=0; i<nums.length; i+=2) {
			res[i] = nums[j];
			res[i+1] = nums[n+j];
			j++;
		}
		return res;
	}

}
