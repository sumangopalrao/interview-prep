//Leetcode:: Find the pivot index of an array where the sum of integers to the left of index is same as the sum of integers to the right of the array

package arrays;

public class FindPIvotIndex {
    public static int pivotIndex(int[] nums) {

        int totalSum = 0;
        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == (totalSum - nums[i] - leftSum))
                return i;

            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 7, 3, 6, 5, 6 };
        System.out.println(pivotIndex(arr));
    }
}
