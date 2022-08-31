// Design a min stack with basic operations along with getMin

package design;

import java.util.Stack;

public class MinStack {

    Stack<Tuple> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        int min;
        if(stack.isEmpty() || stack.peek().min > val) {
            min = val;
        } else {
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

    private static class Tuple {
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

    public static void main(String[] args) {
        MinStack st = new MinStack();
        st.push(2);
        st.push(4);
        st.push(-1);
        st.push(3);
        System.out.println(st.top());
        System.out.println(st.getMin());
        st.pop();
        st.pop();
        System.out.println(st.getMin());
    }
}