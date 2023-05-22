// Find the top K frequent elements in an array
// https://leetcode.com/problems/top-k-frequent-elements/description/

package heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 0, -1, 5};
        int[] res = topKElements(array, 3);
        for (int i=0; i< res.length; i++) {
            System.out.println(res[i]);
        }
    }
    
    public static int[] topKElements(int[] nums, int k) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return counts.get(num1).compareTo(counts.get(num2));
            }
        });

        for (int num : counts.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        return heap.stream().mapToInt(i -> i).toArray();
    }
}
