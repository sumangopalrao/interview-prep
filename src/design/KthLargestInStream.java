// Design a classs to find the Kth largest in a stream of array
// https://leetcode.com/problems/kth-largest-element-in-a-stream/k
// TODO:: Implement using min-heap to improve efficiency

package design;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class KthLargestInStream {
    
    List<Integer> nums;
    int k;
    
    public KthLargestInStream(int k, int[] nums) {
        this.k = k;
        this.nums = new ArrayList<>();
        for (int num : nums) {
            this.nums.add(num);
        }
        
    }
    
    public int add(int val) {
        nums.add(val);
        return this.findKthLargest();
    }
    
    private int findKthLargest() {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        int count = k;
        
        for (int num : nums) {
            queue.add(num);
        }
        
        while(count > 1) {
            queue.poll();
            count--;
        }
        
        return queue.peek();
    }
    
    public static void main(String[] args) {
        KthLargestInStream obj = new KthLargestInStream(3, new int[]{4, 5, 8, 2});
        System.out.println(obj.add(3));
        System.out.println(obj.add(5));
        System.out.println(obj.add(10));
    }
}
