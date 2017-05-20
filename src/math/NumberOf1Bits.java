//WAP to find the number of one bits in an integer.
package math;

public class NumberOf1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int count = 0;
		while(n > 0) {
			if((n & 1) == 1) {
				count++;
			}
			n = n >> 1;
		}
		System.out.println(count);
	}

}
