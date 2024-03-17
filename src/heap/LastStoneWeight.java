// WAP to find the last stone weight given an arary of stones with different weights
// https://leetcode.com/problems/last-stone-weight/description/

package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        // int[] stones = new int[]{2, 7, 4, 1, 8, 1};
        int[] stones = new int[]{1};
        System.out.println(lastStoneWeight(stones));
    }

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });

        for(int stone : stones) {
            heap.add(stone);
        }

        while(!heap.isEmpty()) {
            int x = heap.poll();
            if (heap.isEmpty()) {
                return x;
            }
            int y = heap.poll();
            if (x != y) {
                heap.offer(x - y);
            }
        }
        // System.out.println("Highest" + heap.peek());
        return 0;
    }
}