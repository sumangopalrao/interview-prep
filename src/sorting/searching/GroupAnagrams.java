//Given an array of strings, group the anagrams together.
//CTCI 10.2
// https://leetcode.com/problems/group-anagrams/

package sorting.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GroupAnagrams {

	private static class SortWords implements Comparator<String> {

		private String sortedChars(String s) {
			char[] str = s.toCharArray();
			Arrays.sort(str);
			return new String(str);
		}

		@Override
		public int compare(String s1, String s2) {
			return sortedChars(s1).compareTo(sortedChars(s2));
		}
	}

	private static String[] group(String[] in) {
		List<List<String>> out = new ArrayList<List<String>>();
		String[] sorted = new String[in.length];
		int i = 0;
		for (String s : in) {
			char[] sortedStr = s.toCharArray();
			Arrays.sort(sortedStr);
			sorted[i] = new String(sortedStr);
			i++;
		}
		return sorted;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = new String[] { "act", "mad", "bad", "adm", "cat" };
		Arrays.sort(input, new SortWords());
		for (String s : input) {
			System.out.println(s);
		}
	}

}
