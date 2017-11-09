//Given a digit string, return all the letter combinations.
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/#/description
//CTCI 

package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

	static List<String> out = new ArrayList<String>();
	public static List<String> letterCombinations(String digits) {
		Map<Character, String> dict = new HashMap<Character, String>();
		dict.put('2', "abc");
		dict.put('3', "def");
		dict.put('4', "ghi");	
		dict.put('5', "jkl");
		dict.put('6', "mno");
		dict.put('7', "pqrs");
		dict.put('8', "tuv");
		dict.put('9', "wxyz");
		getCombinations(dict, digits, "", 0);
		return out;
	}
	
	static void getCombinations(Map<Character, String> dict, String digits, String word, int digitIndex) {
		if(word.length() == digits.length()) {
			out.add(word);
			return;
		}
			String letters = dict.get(digits.charAt(digitIndex));
			if(letters != null)
			{
				for(int j=0; j<letters.length(); j++) {
					getCombinations(dict, digits, word+letters.charAt(j), digitIndex+1);	
				}
			}
			
			if(word.length() == 0)
				return;
			word = word.substring(0, word.length()-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "3";
		List<String> combinations = letterCombinations(digits);
		for(String str : combinations) {
			System.out.println(str);
		}
	}

}
