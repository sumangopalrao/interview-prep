// Find the pivot integer in the given integer n. Pivot integer is the integer x such that sum of all integers upto x is equal to sum of all integers from x to n.
// https://leetcode.com/problems/find-the-pivot-integer/

package math;

public class PivotInteger {

    public static void main(String[] args) {
        PivotInteger pivotInteger = new PivotInteger();
        System.out.println(pivotInteger.pivotInteger(10));
    }

    public int pivotInteger(int n) {

        for (int x = 1; x <= n; x++) {
            int sumUptoX = 0;
            int sumFromX = 0;
            for (int i = 0; i <= x; i++) {
                sumUptoX += i;
            }

            for (int i = x; i <= n; i++) {
                sumFromX += i;
            }

            if (sumUptoX == sumFromX)
                return x;
        }

        return -1;
    }
}
