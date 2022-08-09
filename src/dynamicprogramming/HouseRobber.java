package dynamicprogramming;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 5, 6, 7, 8};
        System.out.println(rob(arr));
    }

    private static int rob(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;

        if (n == 1) {
            return nums[0];
        }

        if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }

        int maxStartingAtOne = nums[0] + rob(Arrays.copyOfRange(nums, 2, n));
        int maxStartingAtTwo = nums[1] + rob(Arrays.copyOfRange(nums, 3, n));

        return Math.max(maxStartingAtOne, maxStartingAtTwo);
    }
}
