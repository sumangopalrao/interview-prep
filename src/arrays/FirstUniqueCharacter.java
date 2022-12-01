// https://leetcode.com/explore/learn/card/hash-table/184/comparison-with-other-data-structures/1120/
// Leetcode: Find the first non repeating character in a string

package arrays;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("First uninque character is: " + firstUniqChar("aaabdcd"));

    }

    public static int firstUniqChar(String s) {
        int[] countMap = new int[26];

        for (int i = 0; i < s.length(); i++) {
            countMap[((int) s.charAt(i)) - ((int) 'a')]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (countMap[((int) s.charAt(i)) - ((int) 'a')] == 1) {
                return i;
            }
        }
        return -1;
    }
}
