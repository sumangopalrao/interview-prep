package arrays;

public class ReverseString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char[] s = {'h', 'e', 'l', 'l', 'o', 'a'};
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }

        for (char c : s) {
            System.out.println(c);
        }
    }
}
