// WAP to find the number of one bits in an integer.
// Leetcode: Hamming weight
// https://leetcode.com/problems/number-of-1-bits/description/

package math;

public class NumberOf1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 111111111;
		int count = 0;
		for(int i=1; i<33; i++) {
			if((n & (1 << i)) != 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
