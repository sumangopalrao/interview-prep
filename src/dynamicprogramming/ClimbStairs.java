// Leetcode: Find distinct ways to reach the top if you can climb either 1 or 2 steps at a time
package dynamicprogramming;

public class ClimbStairs {


    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    private static int climbStairs(int n) {
        int one = 1;
        int two = 1;
        for (int i=0; i<n; i++) {

            int temp = one;
            one = one + two;
            two = temp;
        }
        return one;
    }
}
