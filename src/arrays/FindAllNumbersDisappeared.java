package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappeared {
    public static List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> allNumbers = new HashSet<Integer>();
        for(int i : nums) {
            allNumbers.add(i);
        }

        List<Integer> res = new ArrayList<Integer>();
        for(int i=1; i<=nums.length; i++) {
            if(!allNumbers.contains(i)) {
                res.add(i);
            }
        }
        return res;

    }

    public static List<Integer> findDisappearedNumbersOnePass(int[] nums) {

        // Set<Integer> allNumbers = new HashSet<Integer>();
        // for(int i : nums) {
            // allNumbers.add(i);
        // }

        List<Integer> res = new ArrayList<Integer>();

        int i = 0;
        while (i < nums.length) {
            if(nums[i] == -1) {
                i++;
                continue;
            }
            int temp = nums[i];
            nums[i] = nums[temp - 1];
            nums[temp-1] = -1;
            i++;
        }

        for(int val : nums) {
            System.out.println(val); 
        }


        // for(int i=1; i<=nums.length; i++) {
        //     if(!allNumbers.contains(i)) {
        //         res.add(i);
        //     }
        // }
        return res;

    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList<Integer> inList = new ArrayList<Integer>(Arrays.asList(4,3,2,1));
		// List<Integer> res = nextGreater(inList);
		// for(Integer i : res) {
		// 	System.out.println(i);
		// }
        int[] arr = {1, 3, 2, 1};
        List<Integer> res = findDisappearedNumbersOnePass(arr);
        for(Integer i : res) {
            System.out.println(findDisappearedNumbers(arr));
        }
	}
}
