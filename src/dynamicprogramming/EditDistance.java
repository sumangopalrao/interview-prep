package dynamicprogramming;

public class EditDistance {
	
	public static int minOfThree(int a, int b, int c) {
		if(a < b && a < c)
			return a;
		else if(b < a && b < c)
			return b;
		return c;
	}
	
	public static int editDistance(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int[m+1][n+1];
		for(int i=0; i<=m; i++) {
			for(int j=0; j<=n; j++) {
				if(i == 0) {
					dp[i][j] = j;
				}
				else if(j == 0) {
					dp[i][j] = i;
				}
				else if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				}
				else {
					dp[i][j] = minOfThree(dp[i][j-1]+1, dp[i-1][j]+1, dp[i-1][j-1]+1);
				}
			}
		}
		return dp[m][n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "sea";
		String s2 = "ate";
		System.out.println(editDistance(s1, s2));
	}

}
