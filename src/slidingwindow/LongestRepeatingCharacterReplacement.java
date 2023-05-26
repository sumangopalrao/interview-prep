// Program to find the longeest repeating character string formed after removing k characters from string
// https://leetcode.com/problems/longest-repeating-character-replacement/description/

package slidingwindow;

import java.util.Arrays;

public class LongestRepeatingCharacterReplacement {
    
    public static int longestRepeatingCharReplacement(String s, int k) {
        int i = 0;
        int j = 0;
        int[] counts = new int[26];
        int maxLen = 0;
        
        while(j < s.length()) {
            counts[s.charAt(j) - 'A']++;
            j++;
            
            int windowSize = j - i;
            int maxRepeatedCharacterCount = Arrays.stream(counts).max().getAsInt();
            int needToReplace = windowSize - maxRepeatedCharacterCount;
            if (needToReplace <= k) {
                
                if (windowSize > maxLen) {
                    maxLen = windowSize;
                }
            } else {
                counts[s.charAt(i) - 'A']--;
                i++;
            }
        }
        
        return maxLen;
    }
    
    public static void main(String[] args) {
        System.out.println(longestRepeatingCharReplacement("ABAB", 2));
        System.out.println(longestRepeatingCharReplacement("AABABBA", 1));
    }
    
}
