package math;

public class MultiplyStrings {

    public static void main(String[] args) {
        MultiplyStrings multiplyStrings = new MultiplyStrings();
        System.out.println(multiplyStrings.multiplyStrings("123", "456"));
    }

    private String multiplyStrings(String num1, String num2) {

        StringBuffer result = new StringBuffer();
        int carry = 0;

        int minLen = num1.length() < num2.length() ? num1.length() : num2.length();

        for (int i=minLen; i>0; i--) {
            for (int j=num2.length(); j>0; j--) {
                int product = (num1.charAt(i-1) - '0') * (num2.charAt(i-1) - '0');
                product += carry;
                System.out.println(product);
                carry = product / 10;
                result.append(product % 10);
            }
        }

        return result.reverse().toString();

    }
    
}
