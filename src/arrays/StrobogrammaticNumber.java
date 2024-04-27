// Problem: Strobogrammatic Number
// A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).
// https://leetcode.com/problems/strobogrammatic-number/

package arrays;

public class StrobogrammaticNumber {
    public static void main(String[] args) {
        System.out.println(isStrobogrammatic("123"));
        System.out.println(isStrobogrammatic("69"));
        System.out.println(isStrobogrammatic("2"));
    }

    public static boolean isStrobogrammatic(String num) {

        for(int i=0; i<=num.length() / 2; i++) {

            if (num.charAt(i) == '2' || num.charAt(i) == '3' || num.charAt(i) == '4' || num.charAt(i) == '5' || num.charAt(i) == '7') {
                return false;
            }

            if (num.charAt(i) == '1' && num.charAt(num.length() - i - 1) != '1') {
                return false;
            }

            if (num.charAt(i) == '8' && num.charAt(num.length() - i - 1) != '8') {
                return false;
            }

            if (num.charAt(i) == '6' && num.charAt(num.length() - i - 1) != '9') {
                return false;
            }

            if (num.charAt(i) == '9' && num.charAt(num.length() - i - 1) != '6') {
                return false;
            }

        }

        return true;
        
    }
}
