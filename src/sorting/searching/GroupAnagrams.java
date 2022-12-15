//Given an array of strings, group the anagrams together.
//CTCI 10.2
// https://leetcode.com/problems/group-anagrams/
// https://leetcode.com/explore/learn/card/hash-table/185/hash_table_design_the_key/1124/

package sorting.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

	public List<List<String>> groupAnagrams(String[] strs) {

		String[] in = new String[strs.length];
		for (int i = 0; i < in.length; i++) {
			in[i] = strs[i];
		}
		List<List<String>> out = new ArrayList<List<String>>();
		HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();

		for (int i = 0; i < in.length; i++) {
			char[] c = in[i].toCharArray();
			Arrays.sort(c);
			String s = new String(c);
			in[i] = s;
		}

		for (int j = 0; j < in.length; j++) {
			if (map.get(in[j]) != null) {
				List<Integer> indexes = map.get(in[j]);
				indexes.add(j);
				map.put(in[j], indexes);
			} else {
				List<Integer> ind = new ArrayList<Integer>();
				ind.add(j);
				map.put(in[j], ind);
			}
		}

		Iterator it = map.entrySet().iterator();
		int k = 0;
		while (it.hasNext()) {
			Map.Entry<String, List<Integer>> entry = (Map.Entry<String, List<Integer>>) it.next();
			List<String> list = new ArrayList<String>();
			for (Integer i : entry.getValue()) {
				list.add(strs[i]);
			}
			out.add(list);
		}

		return out;
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
