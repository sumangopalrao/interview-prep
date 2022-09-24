// Leetcode: Sort array by increasing frequency

package arrays;

import java.util.*;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,2,2,3};
        int[] res = frequencySort(nums);
        for (int i: res) {
            System.out.println(i);
        }
    }

    private static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            if (counts.get(num) != null) {
                int count  = counts.get(num);
                counts.put(num, count + 1);
            } else {
                counts.put(num, 0);
            }
        }

        Integer[] arr = new Integer[nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Integer) nums[i];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                if(map.get(a).equals(map.get(b))) {
                    return b - a;
                }
                return map.get(a) - map.get(b);
            }
        });
        return Arrays.stream(arr).mapToInt(Integer::valueOf).toArray();
    }
}