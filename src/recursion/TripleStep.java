//Program to find the number of ways a child reach nth step. 
//CTCI 8.1

package recursion;

import java.util.Arrays;

public class TripleStep {
	
	static int[] res = new int[5];
	
	public static int numberOfSteps(int n) {
		if(n < 0)
			return 0;
		if( n == 0)
			return 1;
		if( res[n] > -1)
			return res[n];
		
		res[n] = numberOfSteps(n-1) + numberOfSteps(n-2) + numberOfSteps(n-3);
		return res[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.fill(res,  -1);
		System.out.println(numberOfSteps(4));
	}

}
