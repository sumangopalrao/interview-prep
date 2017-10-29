//Given a string like aaabbc compress it to a3b2c1.
//CTCI 1.6

package arrays;

public class StringCompression {
	public static void main(String[] args) {
		String in = "aabbbbbccd";
		StringBuilder out = new StringBuilder();
		int i = 0;
		while( i < in.length()) {
			int count = 1;
			int j = i+1;
			while(j < in.length() && in.charAt(j) == in.charAt(i)) {
				j++;
				count++;
			}
			out.append(in.charAt(i));
			out.append(count);
			i = j;
		}
		if(out.length() > in.length()) 
			System.out.println(in);
		System.out.println(out.toString());
	}
}