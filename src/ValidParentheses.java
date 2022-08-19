//Leetcode: Check if string has valid matching parentheses such that two parens are of the same type and open brackets are closed in the correct order

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValidParentheses("()"));
        System.out.println(isValidParentheses("()[]{}"));
        System.out.println(isValidParentheses("(]"));
    }
    private static boolean isValidParentheses(String str) {
        Stack<Character> st = new Stack<>();

        for (Character c : str.toCharArray()) {
            if (c == '}') {
                if (st.empty() || st.pop() != '{')
                    return false;
            }
            else if( c == ')') {
                if (st.empty() || st.pop() != '(')
                    return false;
            }
            else if (c == ']') {
                if (st.empty() || st.pop() != '[')
                    return false;
            } else {
                st.push(c);
            }
        }

        return st.empty();
    }
}
