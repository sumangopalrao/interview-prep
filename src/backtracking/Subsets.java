//Program to find the subsets of a set.
//CTCI 

package backtracking;

import java.util.ArrayList;
import java.util.List;


public class Subsets {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> input = new ArrayList<Character>();
		input.add('a');
		input.add('b');
		input.add('c');
		List<List<Character>> out = new ArrayList<List<Character>>();
		List<Character> curr = new ArrayList<Character>();
		out.add(curr);
		subsets(0, out, curr, input);
		for(List<Character> l : out) {
			System.out.println();
			for(Character c : l) {
				System.out.print(c+",");
			}
		}
	}
	
	public static void subsets(int start, List<List<Character>> out, List<Character> curr, List<Character> in) {
		if(start == in.size()) {
			return;
		}
		List<List<Character>> out_copy = new ArrayList<List<Character>>(out);
		for(List<Character> l : out_copy) {
			List<Character> c = new ArrayList<Character>();
			for(Character x : l) {
				c.add(x);
			}
			c.add(in.get(start));
			out.add(c);
		}
		subsets(start+1, out, curr, in);
	}

}
