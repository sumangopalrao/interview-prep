//Leetcode: Find the square root of an integer number

package math;

public class SquareRoot {

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(sqrt(4));
        System.out.println(sqrt(8));
    }

    private static int sqrt(int x) {

        if ( x <= 1)
            return x;

        long start = 2;
        long end = x / 2;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x) {
                return (int) mid;
            }
            else if (mid * mid < x) {
                start = mid + 1;
            }
            else end = mid - 1;
        }

        return (int) end;
    }

    private static int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }
}
