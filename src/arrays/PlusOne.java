package arrays;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {9, 9, 9};
        for (int num : plusOne(arr)) {
            System.out.println(num);
        }
    }

    public static int[] plusOne(int[] nums) {
        if(nums[nums.length - 1] != 9) {
            nums[nums.length - 1] = nums[nums.length - 1] + 1;
            return nums;
        }

        int[] res = new int[nums.length + 1];
        int j = res.length - 1;
        res[j] = 0;
        j--;
        int carry = 1;
        for (int i=nums.length - 2; i>=0; i--) {
            int sumVal = nums[i] + carry;
             if (sumVal == 10) {
                 res[j] = 0;
             } else {
                 res[j] = sumVal;
                 carry = 0;
             }
             j--;
        }

        if (carry == 1) {
            res[0] = 1;
            return res;
        }

        return Arrays.copyOfRange(res, 1, res.length);
    }
}
