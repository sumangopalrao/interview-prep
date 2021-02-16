// Leetcode 1431. Kids With the Greatest Number of Candies 
// Given the array candies and the integer extraCandies, where candies[i] represents the number of candies that the ith kid has.



package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,1,12};
		List<Boolean> res = kidsWithCandies(arr, 10);
		System.out.println(Arrays.toString(res.toArray()));

	}
	
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		
		int max = Integer.MIN_VALUE;
		for (int i=0; i<candies.length; i++) {
			if (candies[i] > max) {
				max = candies[i];
			}
		}
		
		List<Boolean> res = new ArrayList<Boolean>();

		for(int i=0; i<candies.length; i++) {
			if(candies[i] + extraCandies < max) {
				res.add(false);
			}
			else {
				res.add(true);
			}
		}
		return res;
    }
}
