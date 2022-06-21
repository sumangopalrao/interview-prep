// Leetcode:: Find intersection of two arrays II

package arrays;

import java.util.*;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] nums1 = {1, 2, 2, 3};
        int[] nums2 = {1, 2, 2, 4};

        int[] res = findIntersection(nums1, nums2);

        for(int i:res)
        {
            System.out.println(i);
        }

    }

    public static int[] findIntersection(int[] nums1, int[] nums2)
    {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        for(int num: nums1)
        {
            map1.merge(num, 1, Integer::sum);
        }
        for(int num: nums2)
        {
            if (map1.get(num) != null &&  map1.get(num) != 0) {
                map1.put(num, map1.get(num) - 1);
                res.add(num);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

}
