//LeetCode: Find intersection of arrays I.
// https://leetcode.com/explore/learn/card/hash-table/183/combination-with-other-algorithms/1105/

package arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = { 1 };
		int[] nums2 = { 1 };

		// int[] res = naive(nums1, nums2);
		int[] res = optimized(nums1, nums2);

		for (int i : res) {
			System.out.println(i);
		}

	}

	public static int[] naive(int[] nums1, int[] nums2) {
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]) {
					s.add(nums1[i]);
				}
			}
		}
		int[] res = new int[s.size()];
		int index = 0;
		for (Integer i : s) {
			res[index++] = i;
		}
		return res;
	}

	public static int[] optimized(int[] nums1, int[] nums2) {
		int index = 0;
		Set<Integer> arr = new HashSet<Integer>();
		for (int num : nums1) {
			arr.add(num);
		}
		Set<Integer> arr2 = new HashSet<Integer>();
		for (int num : nums2) {
			arr2.add(num);
		}

		Iterator<Integer> iter = arr.iterator();

		while (iter.hasNext()) {
			int i = iter.next();
			if (!arr2.contains(i))
				iter.remove();
			// arr.remove(i);
		}
		int[] res = new int[arr.size()];
		for (int i : arr) {
			res[index++] = i;
		}
		return res;

	}

}
