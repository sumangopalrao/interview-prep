// C7.1 EPI Convert string to int and vice versa.
// Leetcode String to Integer

package arrays;

public class StringToInt {
	
	private static String intToString(int m) {
		StringBuilder str = new StringBuilder();
		if(m == 0)
			return new String("0");
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
		int val = 0;
		int i = 0;
		int r = 1;
		if(s.charAt(0) == '-') {
			i=1;
			r=-1;
		}
		for(; i<s.length(); i++) {
			int v = s.charAt(i) - '0';
			val = val*10 + v;
		}
		return val*r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		System.out.println(intToString(n));
		String s = "-321000";
		System.out.println(stringToInt(s));
	}

}
