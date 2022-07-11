// Leetcode: IsValidPalindrome

package arrays;

public class IsStringValidPalindrome {

    public static void main(String[] args) {
        String str = "  ";
        System.out.println(isValidPalindrome(str));
    }

    private static boolean isValidPalindrome(String str) {
        String s = str.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder strB = new StringBuilder(s);
        strB.reverse();
        return s.equalsIgnoreCase(strB.toString());
    }
}
