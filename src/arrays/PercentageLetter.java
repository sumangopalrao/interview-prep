package arrays;

// Given a string s and a character c, return the percentage of the character c in the string s.
// https://leetcode.com/problems/percentage-of-letter-in-string/

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.percentageLetter("leetcode", 'e'));
        System.out.println(solution.percentageLetter("leetcode", 'l'));
        System.out.println(solution.percentageLetter("leetcode", 'o'));
    }

    public int percentageLetter(String s, char letter) {
        int totalCount = s.length();
        int count = 0;
        for(int i=0; i<totalCount; i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }

        return (count * 100) / totalCount;
        
    }
}