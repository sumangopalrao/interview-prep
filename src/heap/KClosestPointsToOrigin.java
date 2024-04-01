// Program to find the K Closest points to the origin
// https://leetcode.com/problems/k-closest-points-to-origin/description/

package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {

    private static class Tuple {
        int dist;
        int x;
        int y;

        Tuple(int dist, int x, int y) {
            this.dist = dist;
            this.x = x;
            this.y = y;
        }

        Integer getDist() {
            return dist;
        }

        Integer getX() {
            return x;
        }

        Integer getY() {
            return y;
        }
    }

    public static void main(String[] args) {
        int[][] array = { { 1, 3 }, { -2, 2 } };
        int[][] res = kClosest(array, 1);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + "," + res[i][1]);
        }
    }

    public static int[][] kClosest(int[][] nums, int k) {
        PriorityQueue<Tuple> heap = new PriorityQueue<>(new Comparator<Tuple>() {
            @Override
            public int compare(Tuple num1, Tuple num2) {
                return num2.getDist().compareTo(num1.getDist());
            }
        });

        for (int[] num : nums) {
            int distance = (int) (Math.pow(num[0], 2) + Math.pow(num[1], 2));
            Tuple elem = new Tuple(distance, num[0], num[1]);
            heap.offer(elem);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[][] output = new int[k][2];
        int i = 0;
        while (!heap.isEmpty() && i < k) {
            Tuple heapElem = heap.poll();
            output[i][0] = heapElem.getX();
            output[i][1] = heapElem.getY();
            i++;
        }

        return output;

    }
}
