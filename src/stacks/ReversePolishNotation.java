// Convert array in reverse polish notattion to its value after evaluating.
// https://leetcode.com/problems/evaluate-reverse-polish-notation/description/

package stacks;

import java.util.Stack;

public class ReversePolishNotation {
    
    private static int evalRpn(String[] tokens) {
        Stack<String> operands = new Stack<String>();
        
        for (int i=0; i<tokens.length; i++) {
            if (!tokens[i].equals("+") &&  !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                operands.push(tokens[i]);
            } else {
                int rhs = Integer.parseInt(operands.pop());
                int lhs = Integer.parseInt(operands.pop());
                
                int res;
                String operandValue =  tokens[i];
                if (operandValue.equals("+")) {
                    res = lhs + rhs;
                } else if (operandValue.equals("-")) {
                    res = lhs - rhs;
                } else if (operandValue.equals("*")) {
                    res = lhs * rhs;
                } else {
                    res = lhs / rhs;
                }
                operands.push(String.valueOf(res));
            }
        }
        
        return Integer.parseInt(operands.pop());
    }
    
    public static void main(String[] args) {
        System.out.println(evalRpn(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(evalRpn(new String[]{"4","13","5","/","+"}));
        System.out.println(evalRpn(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}

// private static int evalRpn(String[] tokens) {
    
    // Stack<String> operands = new Stack<String>();
    // // Stack<Integer> numbers = new Stack<>();
    
    // int res = -1;
    // for (int i=tokens.length - 1; i>=0; i--) {
        //     if (tokens[i] == "+" || tokens[i] == "-" || tokens[i] == "*" || tokens[i] == "/") {
            //         operands.push(tokens[i]);
            //     } else if (operands.peek() != "+" &&  operands.peek() != "-" && operands.peek() != "*" && operands.peek() != "/") {
                //         int lhs = Integer.parseInt(tokens[i]);
                //         int rhs = Integer.parseInt(operands.pop());
                
                //         String operandValue =  operands.pop();
                //         if (operandValue == "+") {
                    //             res = lhs + rhs;
                    //         } else if (operandValue == "-") {
                        //             res = lhs - rhs;
                        //         } else if (operandValue == "*") {
                            //             res = lhs * rhs;
                            //         } else {
                                //             res = (int)Math.floor(lhs / rhs);
                                //         }
                                //         operands.push(res+"");
                                //     } else {
                                    //         operands.push(tokens[i]);
                                    //     }
                                    // }
                                    
                                    // while(!operands.isEmpty()) {
                                        //     int lhs = Integer.parseInt(operands.pop());
                                        //     int rhs = Integer.parseInt(operands.pop());
                                        
                                        //     String operandValue =  operands.pop();
                                        //     if (operandValue == "+") {
                                            //         res = lhs + rhs;
                                            //     } else if (operandValue == "-") {
                                                //         res = lhs - rhs;
                                                //     } else if (operandValue == "*") {
                                                    //         res = lhs * rhs;
                                                    //     } else {
                                                        //         res = (int)Math.floor(lhs / rhs);
                                                        //     }
                                                        //     operands.push(res+"");
                                                        // }
                                                        
                                                        // return res;
                                                        // }
                                                        
                                                        //     public static void main(String[] args) {
                                                            //         System.out.println(evalRpn(new String[]{"2", "1", "+", "3", "*"}));
                                                            //         // System.out.println(evalRpn(new String[]{"4","13","5","/","+"}));
                                                            //     }
                                                            // }
                                                            
                                                            // for (int i=tokens.length - 1; i>=0; i--) {
                                                                //     if (tokens[i] == "+" || tokens[i] == "-" || tokens[i] == "*" || tokens[i] == "/") {
                                                                    //         operands.push(tokens[i]);
                                                                    //     } else {
                                                                        //         numbers.push(Integer.valueOf(tokens[i]));
                                                                        //     }
                                                                        // }
                                                                        
                                                                        // int res = -1;
                                                                        // while(!operands.isEmpty() && !numbers.isEmpty()) {
                                                                            //     int lhs = numbers.pop();
                                                                            //     int rhs = numbers.pop();
                                                                            
                                                                            //     String operandValue =  operands.pop();
                                                                            //     if (operandValue == "+") {
                                                                                //         res = lhs + rhs;
                                                                                //     } else if (operandValue == "-") {
                                                                                    //         res = lhs - rhs;
                                                                                    //     } else if (operandValue == "*") {
                                                                                        //         res = lhs * rhs;
                                                                                        //     } else {
                                                                                            //         res = lhs / rhs;
                                                                                            //     }
                                                                                            //     numbers.push(res);
                                                                                            // }
                                                                                            
                                                                                            // return res;
                                                                                            
                                                                                            // }
                                                                                            
                                                                                            
                                                                                            // }
                                                                                            