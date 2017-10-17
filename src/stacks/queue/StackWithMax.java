//WAP to implement a stack with a max api.
//C9.1 EPI
package stacks.queue;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackWithMax {
	
	public static class Tuple {
		int max;
		int count;
		
		public Tuple(int max, int count) {
			this.max = max;
			this.count = count;
		}
		
		public Tuple(int max) {
			this.max = max;
			this.count = 1;
		}
		
		public int getValue() {
			return this.max;
		}
		
		public int getCount() {
			return this.count;
		}
		
		public void setCount(int count) {
			this.count = count;
		}
	}

	Stack<Integer> st;
	Stack<Tuple> maxStack;
	
	public StackWithMax() {
		// TODO Auto-generated constructor stub
		st = new Stack<Integer>();
		maxStack = new Stack<Tuple>();
	}
	
	public void push(int val) {
		st.push(val);
		if(maxStack.isEmpty()) {
			maxStack.push(new Tuple(val));
			return;
		}
		if(val > maxStack.peek().getValue()) {
			maxStack.push(new Tuple(val));
		}
		else if(val == maxStack.peek().getValue()) {
			Tuple t = maxStack.pop();
			t.setCount(t.getCount()+1);
			maxStack.push(t);
		}
	}
	
	public int pop() {
		if(st.isEmpty())
			throw new EmptyStackException();
		int val = st.pop();
		if(val < maxStack.peek().getValue())
			return val;
		Tuple t = maxStack.pop();
		if(t.getCount() > 1) {
			t.setCount(t.getCount() -1);
			maxStack.push(t);
		}
		return val;
	}
	
	public int max() {
		return maxStack.peek().getValue();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWithMax stack = new StackWithMax();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(5);
		stack.push(5);
		System.out.println("Max:"+stack.max());
		stack.pop();
		System.out.println("Max:"+stack.max());
		stack.pop();
		System.out.println("Max:"+stack.max());
		stack.pop();
		System.out.println("Max:"+stack.max());
		stack.pop();
		System.out.println("Max:"+stack.max());
	}

}
