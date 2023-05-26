// Find the longest substring without repeating characters
// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

package slidingwindow;

import java.util.HashSet;
import java.util.Set;


public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        Set<Character> set = new HashSet<Character>();
        int maxLen = 0;

        while(j < s.length()) {

            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;

                if (j - i > maxLen) {
                    maxLen = j-i;
                }
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        
        return maxLen;
    }
    
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
