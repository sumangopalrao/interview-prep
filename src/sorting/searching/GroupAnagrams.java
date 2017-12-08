//Given an array of strings, group the anagrams together.
//CTCI 10.2

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
		
		public int compare(String s1, String s2) {
			return sortedChars(s1).compareTo(sortedChars(s2));
		
		
		}
	}

	private static String[] group(String[] in) {
		List<List<String>> out = new ArrayList<List<String>>();
		String[] sorted = new String[in.length];
		int i = 0;
		for(String s : in) {
			char[] sortedStr = s.toCharArray();
			Arrays.sort(sortedStr);
			sorted[i] = new String(sortedStr);
			i++;
		}
		//Arrays.sort(sorted);
		return sorted;
//		String prev = null;
//		for(String str : sorted) {
//			if(str == prev) {
//				
//			}
//			else {
//				List<String> inner = new ArrayList<String>();
//				inner.add()
//			}
//		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = new String[]{"act", "mad", "bad", "adm", "cat"};
//		List<List<String>> out = group(input);
		Arrays.sort(input, new SortWords());
		//String[] out = group(input);
		for(String s : input) {
			System.out.println(s);
		}
	//	out.forEach(key -> {key.forEach( k -> System.out.println(k)); System.out.println();});
	}

}
