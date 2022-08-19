// C7.1 EPI Convert string to int and vice versa.
// Leetcode String to Integer

package arrays;

public class StringToInt {

	private static String intToString(int m) {
		StringBuilder str = new StringBuilder();
		if(m == 0)
			return "0";
		int n = Math.abs(m);
		while(n > 0) {
			int r = n%10;
			n = n/10;
			str.append(r);
		}
		if(m < 0)
			return str.append("-").reverse().toString();
		return str.reverse().toString();
	}

	private static int stringToInt(String s) {
		int sign = 1;
		if (s.length() == 0)
			return 0;
		long val = 0;
		int i = 0;
		int r = 1;
		boolean flag = false;
		int result = 0;
		int n = s.length();
		while (i < n && s.charAt(i) == ' ') {
			i++;
		}

		if (i < n && s.charAt(i) == '+') {
			sign = 1;
			i++;
		} else if (i < n && s.charAt(i) == '-') {
			sign = -1;
			i++;
		}

		// Traverse next digits of input and stop if it is not a digit
		while (i < n && Character.isDigit(s.charAt(i))) {
			int digit = s.charAt(i) - '0';

			// Check overflow and underflow conditions.
			if ((result > Integer.MAX_VALUE / 10) ||
					(result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
				// If integer overflowed return 2^31-1, otherwise if underflowed return -2^31.
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}

			// Append current digit to the result.
			result = 10 * result + digit;
			i++;
		}

		// We have formed a valid number without any overflow/underflow.
		// Return it after multiplying it with its sign.
		return sign * result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		System.out.println(intToString(n));
		String s = "-91283472332";
		System.out.println(stringToInt(s));
	}

}
