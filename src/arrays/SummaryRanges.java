// Find the summary of ranges which have consecutive numbers
// https://leetcode.com/problems/summary-ranges/description/

package arrays;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    
    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<String>();
        int i = 0;
        while (i < nums.length) {
            int leftEnd = i;
            while ( i + 1 < nums.length && nums[i+1] - nums[i] == 1) {
                i++;
            } 
            
            if (leftEnd == i) {
                res.add(nums[leftEnd] + "");
            }
            else {
                res.add(nums[leftEnd] + "->" + nums[i]);
            }
            i++;
        }
        
        return res;
        
    }
    
    public static void main(String[] args) {
        // List<String> res = summaryRanges(new int[]{1, 2, 3, 5, 6, 7, 9});
        List<String> res = summaryRanges(new int[]{0,1,2,4,5,7});

        for (String s : res) {
            System.out.println(s);
        }
        
    }
}
