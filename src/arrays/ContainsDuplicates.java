// Leetcode: Given array return true if it contains duplicates
package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1, 2, 3, 1};
        System.out.println(containsDuplicateWithSet(arr));
    }

    public static boolean containsDuplicateWithSet(int[] nums) {
        if (nums.length == 1)
            return false;

        Set<Integer> unique = new HashSet<Integer>();

        for (int num : nums) {
            if (unique.contains(num)) {
                return true;
            }
            unique.add(num);
        }
        return false;
    }
}
