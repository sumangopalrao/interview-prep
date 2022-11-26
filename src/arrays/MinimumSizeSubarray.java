// Leetcode:: Given an array return the minimal length of subarray whose sum is greater than or equal to the target

package arrays;

public class MinimumSizeSubarray {

    public static void main(String[] args) {
        System.out.println(minimumLength(new int[] { 2, 3, 1, 2, 4, 3 }, 6));
        System.out.println(minimumLength(new int[] { 1, 4, 4 }, 4));
        System.out.println(minimumLength(new int[] { 2, 3, 1, 2, 4, 3 }, 7));
        System.out.println(minimumLength(new int[] { 1, 1, 1, 1, 1, 1, 1, 1 }, 11));
    }

    private static int minimumLength(int[] arr, int target) {
        int left = 0;
        int sum = 0;
        // int right = left + 1;
        if (arr.length == 0)
            return -1;

        int minLengthSoFar = Integer.MAX_VALUE;
        // int sum = arr[left];
        for (int right = 0; left <= right && right < arr.length; right++) {
            // if (arr[left] >= target) {
            // return 1;
            // }

            sum += arr[right];
            while (sum >= target) {
                if (right - left + 1 <= minLengthSoFar) {
                    minLengthSoFar = right - left + 1;
                }
                sum = sum - arr[left];
                left++;
                // } else {
                // if (right == arr.length - 1) {
                // left++;
                // } else {
                // right++;
                // }
                // left++;
            }
        }

        return minLengthSoFar == Integer.MAX_VALUE ? 0 : minLengthSoFar;
    }
}
