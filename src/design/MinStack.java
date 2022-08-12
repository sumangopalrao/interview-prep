// Design a min stack with basic operations along with getMin

package design;

import java.util.Stack;

public class MinStack {

        Stack<Tuple> stack;
        // int minSoFar = Integer.MAX_VALUE;

        public MinStack() {
            stack = new Stack<Tuple>();
        }

        public void push(int val) {
            int min = 0;
            if(stack.isEmpty() || stack.peek().min > val) {
                min = val;
            }
            else
            {
                min = stack.peek().getMin();
            }
            stack.add(new Tuple(val, min));
        }

        public void pop() {
            stack.pop();

        }

        public int top() {
            return stack.peek().getVal();
        }

        public int getMin() {
            Tuple t = stack.peek();
            return t.getMin();
        }

        private class Tuple {
            int val;
            int min;

            Tuple(int val, int min) {
                this.val = val;
                this.min = min;
            }

            int getMin() {
                return min;
            }

            int getVal() {
                return val;
            }
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
