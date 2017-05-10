package dynamicprogramming;

public class MinStepsToOne {
	static int count = 0;
	static int minSteps(int n) {
		if(n == 1)
			return count;
		int r = 1+minSteps(n-1);
		if(n % 2 == 0)
			r = Math.min(r, 1+minSteps(n/2));
		if(n%3 == 0)
			r = Math.min(r, 1+minSteps(n/3));
		return r;
	}
	
	static int minStepsDP(int n) {
		int[] count = new int[n+1];
		count[0] = 0;
		count[1] = 0;
		for(int i=2; i<=n; i++) {
			count[i] = -1;
		}
//		for(int i=2; i<=n; i++) {
//			count[i] = Integer.MAX_VALUE-1;
//		}
		for(int i=2; i<=n; i++) {
//			int val = Integer.MAX_VALUE;
			int r = count[i-1]+1;
			if(i%2 == 0)
				r = Math.min(r, 1+count[i/2]);
			if(i%3 == 0)
				r = Math.min(r, 1+count[i/3]);
			count[i] = r;
		}
		return count[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println(minStepsDP(4));
		System.out.println(minSteps(10));
	}
}