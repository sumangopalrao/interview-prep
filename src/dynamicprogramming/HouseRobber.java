// Leetcode: HouseRobber - Find the maximum amount that can be robbed given that no two adjacent houses can be robbed

package dynamicprogramming;
import java.util.Arrays;

public class HouseRobber {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 5, 6, 7, 8};
        System.out.println(rob(arr));
        System.out.println(robLoop(arr));
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
        return Math.max(nums[n-1] + rob(Arrays.copyOfRange(nums, 0, n-2)), rob(Arrays.copyOfRange(nums, 0, n-1)));
    }

    private static int robLoop(int[] nums) {
        int maxStartingAtOne = 0;
        int maxStartingAtTwo = 0;
        int temp = 0;
        for (int num : nums) {
            temp = Math.max(num + maxStartingAtOne, maxStartingAtTwo);
            maxStartingAtOne = maxStartingAtTwo;
            maxStartingAtTwo = temp;
        }
        return temp;
    }
}
