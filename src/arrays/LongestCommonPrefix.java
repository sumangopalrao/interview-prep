// Leetcode: Find the longest common prefix among the given strings
// TODO:: Use prefix trie instead

package arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(findLongestCommonPrefix(new String[]{"hello", "he", "h"}));
    }


    private static String findCommonPrefixBetweenStrings(String str1, String str2) {
        StringBuilder prefix = new StringBuilder();
        int len = Math.min(str1.length(), str2.length());
        for (int i=0; i<len; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                prefix.append(str1.charAt(i));
            }
            else
                break;
        }
        return prefix.toString();
    }

    private static String findLongestCommonPrefix(String[] str) {

        if (str.length < 1) {
            return "";
        }

        String prefix = findCommonPrefixBetweenStrings(str[0], str[1]);
        for (int i=2; i<str.length; i++) {
            prefix = findCommonPrefixBetweenStrings(prefix, str[i]);
        }
        return prefix;
    }
}
