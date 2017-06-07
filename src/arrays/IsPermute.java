package arrays;

public class IsPermute {
    private static boolean isPermutation(String s1, String s2) {
        int[] count = new int[26];
        for(int i=0; i<s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
        }
        for(int i=0; i<s2.length(); i++) {
             if(count[s2.charAt(i) - 'a'] == 0)
                 return false;
             count[s2.charAt(i) - 'a']--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isPermutation("aabc", "abc"));
    }
}
