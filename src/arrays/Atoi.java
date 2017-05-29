/**
 * 
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. 
 * Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 */

package arrays;

public class Atoi {
	
	public static int atoi(String str) {
		if(str.isEmpty())
			return 0;
		String trimmedInput = str.trim();
		char sign = trimmedInput.charAt(0);
		boolean positive = true;
		int i = 0;
		if(sign == '-' || sign == '+') {
			i++;
			if(sign == '-')
				positive = false;
			if(i >= trimmedInput.length()) {
				return 0; 
			}
		}
		if((trimmedInput.charAt(i) - '0') < 0 || (trimmedInput.charAt(i) - '0') > 9) {
			return 0;
		}
		long output = 0;
		for(;i<trimmedInput.length();i++) {
			if((trimmedInput.charAt(i) - '0') < 0 || (trimmedInput.charAt(i) - '0') > 9) {
				continue;
			}
			output = output*10 + trimmedInput.charAt(i) - '0';
		}
		if(output > Integer.MAX_VALUE) {
			if(positive) {
				return Integer.MAX_VALUE;
			}
			return Integer.MIN_VALUE;
		}
		if(positive) {
			return (int) output;
		}
		return (int) (-1*output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(atoi("+1dfssdfds123231123"));
	}

}
