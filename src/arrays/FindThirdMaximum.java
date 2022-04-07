package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class FindThirdMaximum {
    public static int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;

        // Comparator comparator = new Comparator<Integer>() {
        //     compare(Integer val1, Integer val2) {
        //         if (val1 < val2) {
        //             return 1;
        //         }
        //         else return 0;
        //     }
        // };
        // PriorityQueue queue = new PriorityQueue<>(comparator);

        HashSet<Integer> set = new HashSet();
        // List<Integer> vals = new ArrayList<Integer>(Arrays.asList(nums));
        for (int i=0; i<nums.length; i++) {
            set.add((Integer)nums[i]);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(Integer val : set) {
            queue.add(val);
        }

        // System.out.println("Top of queue" + queue.peek());

        int maxCount = 0;
        Integer prevTop = Integer.MIN_VALUE;
        Integer maxSoFar = Integer.MIN_VALUE;

        while (!queue.isEmpty()) {
            // Integer top = queue.peek();
            Integer top = queue.poll();

            if (maxSoFar > top) {
                maxSoFar = top;
            }

            if (top != prevTop) {
                maxCount++;
                prevTop = top;
            }
            
            if (maxCount == 3) {
                return top;
            }
        }

        System.out.println("Max count" + maxCount);
        if (maxCount < 3) {
            return maxSoFar;
        }
        return max;
    }

    public static Integer thirdMaxWithSet(int[] nums) {
        Set<Integer> vals = new HashSet<Integer>();
        for (int i=0; i<nums.length; i++) {
            vals.add((Integer)nums[i]);
        }

        Integer maxSoFar = -1;
        for (int i=0; i<3; i++) {
            maxSoFar = getMax(vals);
        }
        return maxSoFar;
    }

    public static Integer getMax(Set<Integer> vals) {

        Integer max = Integer.MIN_VALUE;
        for (Integer key : vals) {
            if (key > max) {
                max = key;
            }
        }
        vals.remove(max);
        return max;

    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList<Integer> inList = new ArrayList<Integer>(Arrays.asList(4,3,2,1));
		// List<Integer> res = nextGreater(inList);
		// for(Integer i : res) {
		// 	System.out.println(i);
		// }
        int[] arr = {1, 3, 2, 1};
        System.out.println(thirdMaxWithSet(arr));
	}
    
}
