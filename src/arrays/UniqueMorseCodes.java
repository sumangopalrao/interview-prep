package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode Unique Morse Codes
 * 
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.

Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation: 
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".
 * 
 * @author suman.rao
 *
 */
public class UniqueMorseCodes {

	
	private static int findUniqueMorseCodes(String[] words) {
		String[] codes = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		Set<String> out = new HashSet<String>();
		for(String str : words) {
			StringBuilder strB = new StringBuilder();
			for(char c : str.toCharArray()) {
				strB.append(codes[c - 'a']);
			}
			out.add(new String(strB));
		}
		return out.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str = {"gin", "zen", "gig", "msg"};
		System.out.println("The number of morse codes:"+findUniqueMorseCodes(str));
	}

}
