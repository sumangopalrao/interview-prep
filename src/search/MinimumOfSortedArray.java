// Find minimum in sorted array
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
// TODO:: Need to review the logic

package search;

public class MinimumOfSortedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[] {4,5,6,7,0,1,2}));
        System.out.println(findMin(new int[] {3,4,5,1,2}));
        System.out.println(findMin(new int[] {11,13,15,17}));
        System.out.println(findMin(new int[] {1, 2}));
        System.out.println(findMin(new int[] {2, 1}));
    } 

    public static int findMin(int[] nums) {
        if(nums.length == 1) return nums[nums.length-1];
        int low = 0;
        int high = nums.length-1;
        int mid;
        int min = nums[0];

        if (nums[high] > nums[low]) {
            return nums[low];
        }

        while(low <= high) {
            if (nums[low] < nums[high]) {
                min = Math.min(min, nums[low]);
                break;
            }
            mid = low + (high - low)/2;
            min = Math.min(min, nums[mid]);
            if(nums[mid] >= nums[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return min;
    }
}
