// Find if a string s is a subsequence of another string t, where subsequence is if t can be equal to s on deleting characters
// https://leetcode.com/problems/is-subsequence/description/

package arrays;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("axc", "abcdef"));
        System.out.println(isSubsequence("abc", "abcdef"));
        System.out.println(isSubsequence("a", "abcdef"));
        System.out.println(isSubsequence("x", "abcdef"));
        System.out.println(isSubsequence("xasdffsf", "abcdef"));
    }

    private static boolean isSubsequence(String s, String t) {

        int j = 0;
        for (int i=0; i<s.length(); i++) {
            while (j < t.length() && t.charAt(j) != s.charAt(i)) {
                j++;
            }

            if (j == t.length()) {
                return false;
            }

            if (t.charAt(j) == s.charAt(i)) {
                j++;
            }

        }
        return true;
    }
}
