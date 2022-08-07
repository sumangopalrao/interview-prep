// Leetcode: Reverse bits of a given 32 bits unsigned integer.
package math;

public class ReverseIntegerBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 43261596;
		int n = 4;
		int result = 0;
	    for (int i = 0; i < 32; i++) {
	    	int maskedVal = n&1;
	        result += maskedVal;
	        n >>>= 1;   // CATCH: must do unsigned shift
	        if (i < 31) // CATCH: for last digit, don't shift!
	            result <<= 1;
	    }
	    System.out.println(result);
	}

}