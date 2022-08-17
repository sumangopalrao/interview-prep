// Leetcode: For a given set of numbers in range 0 to n in an array. Find the one missing number.

package math;

public class MissingNumber {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{0, 1, 3}));
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    private static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i<= n; i++) {
            sum += i;
        }

        int sumOfArr = 0;
        for (int num : nums) {
            sumOfArr += num;
        }

        return sum - sumOfArr;
    }
}
