// Leetcode:: https://leetcode.com/explore/learn/card/array-and-string/204/conclusion/1164/
// WAP to reverse words in a string, as well as remove trailing/leading white spaces and reverse.
package arrays;

public class ReverseWords {

	private static String reverse(String input) {
		StringBuilder rev = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			if (input.charAt(i) == ' ') {
				rev.append(" ");
				int j = 1;
				while (i - j > 0 && j < input.length() && input.charAt(i - j) == ' ') {
					j++;
				}
				i = i - j;
			}
			rev.append(input.charAt(i));
		}
		return rev.toString();
	}

	private static String reverseWords(String str) {
		String reversed = reverse(str.trim());
		int i = 0;
		int j = 0;
		StringBuilder rev = new StringBuilder();
		while (j < reversed.length()) {
			if (reversed.charAt(j) == ' ') {
				rev.append(reverse(reversed.substring(i, j)));
				rev.append(' ');
				i = j + 1;
			}
			j++;
		}
		if (j == reversed.length()) {
			rev.append(reverse(reversed.substring(i)));
		}
		return new String(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords(" ").trim());
	}

}
