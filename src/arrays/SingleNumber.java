// Leetcode:: SingleNumber: Find the element in the array that occurs once, whhile all the other elements repeat twice.
package arrays;

public class SingleNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1, 2, 3, 2, 1, -1, 3};
        System.out.println(findSingleNumber(arr));
    }

    public static int findSingleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        int unique = nums[0];
        for (int i=1; i<nums.length; i++) {
            unique ^= nums[i];
        }
        return unique;
    }
}
