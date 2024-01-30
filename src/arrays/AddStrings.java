// Program to add two numbers passed in as strings
// https://leetcode.com/problems/add-strings/

package arrays;

public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("10", "11"));

    }

    public static String addStrings(String num1, String num2) {
        StringBuilder str = new StringBuilder();
        int maxLength = num1.length() > num2.length() ? num1.length() : num2.length();
        // int[] carry = new int[maxLength];        
        int[] sum = new int[maxLength];        

        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        // for(int i=num1.length(); i>=0; i--) {
        // while (i >= 0 || j >= 0) {
            // int sumNotCarry = num1.charAt(i) + num2.charAt(i);
            // int carrySum = 0;
            // if (sumNotCarry > 9) {
                // carrySum = 1;
            // }

            // if (val1 )

        // }

        while (i >= 0 || j >= 0) {
            int x1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int x2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int value = (x1 + x2 + carry) % 10;
            carry = (x1 + x2 + carry) / 10;
            str.append(value);
            i--;
            j--;    
        }
        
        if (carry != 0)
        str.append(carry);
        
        return str.reverse().toString();
    }

}
