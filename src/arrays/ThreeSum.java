// Leetcode: Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

package arrays;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> res = findTriplets(arr);

        for (List<Integer> row : res) {
            for (Integer elem : row) {
                System.out.print(elem + ",");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> findTriplets(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();

        for (int i=0; i<arr.length - 2; i++) {
            if (i > 0 && arr[i-1] == arr[i])
                continue;
            int sum = arr[i] * -1;
            int low = i+1;
            int high = arr.length - 1;

            while (low < high) {
                if (arr[low] + arr[high] == sum) {
                    res.add(Arrays.asList(arr[i], arr[low], arr[high]));
                    while (low < high && arr[low] == arr[low + 1]) low++;
                    while (low < high && arr[high] == arr[high - 1]) high--;
                    low++;
                    high--;
                } else if (arr[low] + arr[high] < sum) {
                    low++;
                } else {
                    high--;
                }
            }

//            List<List<Integer>> pairs = twoSum(arr, sum, i);
//                for (List<Integer> pair : pairs) {
//                    List<Integer> r = new ArrayList<>(pair);
//                    res.add(r);
//                }
            }
        return res;
    }

    private static List<List<Integer>> twoSum(int[] a, int sum, int excludedIndex) {
        HashMap<Integer, Integer> counts = new HashMap<>();

        List<List<Integer>> res = new ArrayList<>();

        for(int i=excludedIndex + 1; i<a.length; i++) {
            if (counts.containsKey(a[i])) {
                counts.put(a[i], counts.get(a[i]) + 1);
            } else {
                counts.put(a[i], 1);
            }
        }

        for (int j = excludedIndex + 1; j<a.length; j++) {
            counts.put(a[j], counts.get(a[j] - 1));

            if (j > excludedIndex + 1 && a[j] == a[j-1]) {
                continue;
            }

            int comp = sum - a[j];

            if (counts.containsKey(comp) && counts.get(comp) != null) {
                List<Integer> triplets = new ArrayList<>();
                triplets.add(a[j]);
                triplets.add(a[excludedIndex]);
                triplets.add(comp);
                res.add(triplets);
            }
        }
        return res;
    }


    private static List<List<Integer>> findPair(int[] a, int sum, int excludedIndex) {
        Set<Integer> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();

        for(int i=excludedIndex; i<a.length; i++)
        {
            if(set.contains(sum-a[i])) {
                List<Integer> pair = new ArrayList<>();
                pair.add(a[i]);
                pair.add(sum - a[i]);
                res.add(pair);
            }
            else {
                set.add(a[i]);
            }
        }
        return res;
    }
}
