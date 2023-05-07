// Leetcode: Find if number is a happy number; sum of squares of individual numbers should be 1
// https://leetcode.com/problems/happy-number/description/
package math;

import java.util.HashSet;
import java.util.Set;

public class HappyNumbers {

    public static boolean isHappy(int n) {
        if (n / 10 == 0 && n % 10 == 1)
            return true;

        int left = n;
        int right = sumOfSquares(n);
        while (right != 1 && left != right) {
            left = sumOfSquares(left);
            right = sumOfSquares(sumOfSquares(right));
        }
        return right == 1;
    }

    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int i = n % 10;
            n = n / 10;
            sum += i * i;
        }
        return sum;
    }

    // using hash set instead
    public static boolean isHappySet(int n) {
        Set<Integer> seen = new HashSet<Integer>();

        while (!seen.contains(n) && n != 1) {
            seen.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
        System.out.println(isHappySet(2));
    }
}
