// WAP to find the number of one bits in an integer.
// Leetcode: Hamming weight

package math;

public class NumberOf1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 111111111;
		int count = 0;
		for(int i=1; i<33; i++) {
			// while(n > 0) {
			if((n & (1 << i)) != 0) {
				count++;
			}
			// n = n >> 1;
		}
//		return count;
		System.out.println(count);
	}

}
