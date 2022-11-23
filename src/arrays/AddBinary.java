//Leetcode:: Add two binary numbers as strings
package arrays;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11000", "1001"));
    }

    private static String addBinary(String a, String b) {
        if (a.length() == 0)
            return b;
        if (b.length() == 0)
            return a;
        String res = "";
        char carry = '0';
        int m = a.length();
        int n = b.length();
        int length = (m <= n) ? m : n;

        for (int i = 0; i < length; i++) {

            if (a.charAt(m - i - 1) == '1' && b.charAt(n - i - 1) == '1') {
                if (carry == '0') {
                    res = "0" + res;
                } else {
                    res = "1" + res;
                }
                carry = '1';
            } else {

                int sum = (a.charAt(m - i - 1) - '0') + (b.charAt(n - i - 1) - '0');
                if (carry == '1') {
                    if (sum == 1) {
                        res = "0" + res;
                    } else {
                        res = "1" + res;
                        carry = '0';
                    }
                } else {
                    res = sum + res;
                }
            }
        }

        if (m - length > 0) {
            for (int i = m - length - 1; i >= 0; i--) {
                if (carry == '1' && a.charAt(i) == '1') {
                    res = "0" + res;
                    carry = '1';
                } else {
                    int sum = (a.charAt(i) - '0') + (carry - '0');
                    res = sum + res;
                    carry = '0';
                }
            }
        } else if (n - length > 0) {
            for (int i = n - length - 1; i >= 0; i--) {
                if (carry == '1' && b.charAt(i) == '1') {
                    res = "0" + res;
                    carry = '1';
                } else {
                    int sum = (b.charAt(i) - '0') + (carry - '0');
                    res = sum + res;
                    carry = '0';
                }
            }
        }

        return carry == '1' ? '1' + res : res;

    }
}
