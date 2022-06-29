// Leetcode find the first non repeating character in a string

package arrays;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s = "leetcode";
        int[] countMap = new int[26];

        for (int i=0; i<s.length(); i++) {
            countMap[((int) s.charAt(i)) - ((int) 'a')]++;
        }

        for (int i=0; i<s.length(); i++) {
            if (countMap[((int) s.charAt(i)) - ((int) 'a')] == 1) {
//                return s.charAt(i);
                System.out.println("The char index is" + i);
                return;
            }
        }
        System.out.println("No char found");
    }
}
