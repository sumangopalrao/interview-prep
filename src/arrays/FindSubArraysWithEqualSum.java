// Find sub arrays with equal sum of length 2
// https://leetcode.com/problems/find-subarrays-with-equal-sum/description/

package arrays;

import java.util.HashSet;
import java.util.Set;

public class FindSubArraysWithEqualSum {

    public static boolean findSubarrays(int[] nums) {
        Set<Integer> seen = new HashSet<>();
 
     for (int i = 1; i < nums.length; ++i) {
       final int sum = nums[i - 1] + nums[i];
       if (seen.contains(sum))
         return true;
       seen.add(sum);
     }
 
     return false; 
    }
     
    
    public static void main(String[] args) {
        System.out.println(findSubarrays(new int[]{4,2,4}));
    }
}
