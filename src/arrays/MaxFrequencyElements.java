// Find the count of the number of elements which have the maximum frequencey.
// https://leetcode.com/problems/count-elements-with-maximum-frequency/description/

package arrays;

class MaxFrequencyElements {
    public int maxFrequencyElements(int[] nums) {
        int[] allNums = new int[100];
        int maxF = 0;
        for(int i=0; i<nums.length; i++) {
            allNums[nums[i] - 1]++;
            if (allNums[nums[i] - 1] > maxF) {
                maxF = allNums[nums[i] - 1];
            }
        }

        int count = 0;
        for(int j=0; j<allNums.length; j++) {
            if (allNums[j] == maxF) {
                count += maxF;
            }
        }
        return count;
    }
}