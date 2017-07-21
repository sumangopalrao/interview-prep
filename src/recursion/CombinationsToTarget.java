//Program to find the number ways to reach a given target given scores such as 2, 3 and 7.
//C18.1 EPI
package recursion;

public class CombinationsToTarget {

	private static int numOfWays(int n) {
		if(n < 2)
			return 0;
		return 1+numOfWays(n-2)+numOfWays(n-3)+numOfWays(n-7);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numOfWays(4));
	}

}
