//Leetcode: Find the kth largest number in an array in O(n) time
package arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestInArray {

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int num : nums) {
            queue.add(num);
        }

        while(k > 1) {
            queue.poll();
            k--;
        }

        return (int) queue.peek();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {3,2,1,5,6,4};
        int[] arr1 = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(arr, 2));
        System.out.println(findKthLargest(arr1, 4));
    }
}
