package dynamicprogramming;

public class LongestNonDecreasingSeq {
	
	static int seq(int[] arr) {
		int[] sol = new int[arr.length+1];
		for(int i=0; i<sol.length; i++) {
			sol[i] = 1;
		}
		
		for(int i=1; i<arr.length; i++) {
			for(int j=0; j<i && arr[i] >= arr[j]; j++) {
				sol[i] = Math.max(1+sol[j], sol[i]);
			}
		}
		return sol[arr.length-1];
	}
	
	public static void main(String[] args) {
		System.out.println(seq(new int[]{5, 3, 4, 8, 6, 9}));
	}
}
