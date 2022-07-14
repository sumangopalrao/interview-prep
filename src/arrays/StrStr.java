// Leetcode: Impement StrStr function
package arrays;

public class StrStr {

    public static void main(String[] args) {
        System.out.println(strStr("aaabd", "aaa"));
    }

    static int strStr(String haystack, String needle) {
        int j=0;
        int index=0;
        if(haystack.equals(needle))
            return 0;
        if(needle.isEmpty())
            return 0;
        if(haystack.isEmpty())
            return -1;
        for(int i=0; i<haystack.length(); i++) {
            while((i+j) < haystack.length()) {
                if(haystack.charAt(i+j) == needle.charAt(j)) {
                    j++;
                    if(j == needle.length())
                        return i;
                }
                else {
                    j=0;
                    break;
                }
            }
        }
        return -1;
    }
}
