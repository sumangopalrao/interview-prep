// Program to find the minimum cost of climbing stairs
// https://leetcode.com/problems/min-cost-climbing-stairs/

package dynamicprogramming;

public class MinCostOfClimbingStairs {

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{10,15,20}));

    }

    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 2];

        for(int i=cost.length-1; i>=0; i--) {

            dp[i] = cost[i] + Math.min(dp[i+1], dp[i+2]);

        }

        return Math.min(dp[0], dp[1]);
    }

    
}
