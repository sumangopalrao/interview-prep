// Find the length of minimum window where all chars of t are there in substring of s
// https://leetcode.com/problems/minimum-window-substring/description/

package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static String minWindow(String s, String t) {

        Map<Character, Integer> charCountOfT = new HashMap<Character, Integer>();
        Map<Character, Integer> windowCharCount = new HashMap<Character, Integer>();

        for(char c : t.toCharArray()) {
            charCountOfT.put(c, charCountOfT.getOrDefault(c, 0) + 1);
        }

        int have = 0;
        int need = t.length();
        int l = 0;
        int r = 0;
        int resLen = Integer.MAX_VALUE;
        String res = "";
        for(; r < s.length(); r++) {
            char ch = s.charAt(r);
            windowCharCount.put(ch, windowCharCount.getOrDefault(ch, 0) + 1);

            if (t.indexOf(ch) != -1 && charCountOfT.get(ch) >= windowCharCount.get(ch)) {
                have++;
            } 

            while(have == need) {
                if (r - l + 1 < resLen) {
                    resLen = r - l + 1;
                    res = s.substring(l, r+1);
                }

                char leftChar = s.charAt(l);
                windowCharCount.put(leftChar, windowCharCount.get(leftChar) - 1);
                if (t.indexOf(leftChar) != -1 && windowCharCount.get(leftChar) < charCountOfT.get(leftChar)) {
                    have--;
                }
                l++;
            }
        }

        return resLen == Integer.MAX_VALUE ? "" : res;

    }
        
    public static void main(String[] args) {

        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(minWindow("aa", "aa"));

    }
}
