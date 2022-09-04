// Find the third maximum of the given array

package arrays;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class FindThirdMaximum {
    public static int thirdMax(int[] nums) {
        int max = Integer.MIN_VALUE;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

        queue.addAll(set);

        int maxCount = 0;
        int prevTop = Integer.MIN_VALUE;
        int maxSoFar = Integer.MIN_VALUE;

        while (!queue.isEmpty()) {
            Integer top = queue.poll();

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
        for (int num : nums) {
            vals.add(num);
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
        int[] arr = {1, 3, 2, 1};
        System.out.println(thirdMaxWithSet(arr));
	}
}
