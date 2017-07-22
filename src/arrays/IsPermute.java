//Program to find if two strings are permutes of each other.
//CTCI 1.2
package arrays;

public class IsPermute {
    private static boolean isPermutation(String s1, String s2) {
        if(s1.length() != s2.length())
        	return false;
    	int[] count = new int[26];
        for(int i=0; i<s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }
        
        for(int i=0; i<s2.length(); i++) {
             count[s2.charAt(i) - 'a']--;
             if(count[s2.charAt(i) - 'a'] < 0)
                 return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isPermutation("bca", "abc"));
    }
}

