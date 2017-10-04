//Implement a set of stacks such that if one exceeds a threshold, it is added to the next one.
//CTCI 3.3

package stacks.queue;

import java.util.EmptyStackException;

public class SetOfStacks {
	
	Stack<Stack<Integer>> st;
	int capacity = 2;
	
	SetOfStacks() {
		st = new Stack<Stack<Integer>>();
	}
	
	public void push(int val) {
		if(!st.isEmpty()) {
			Stack<Integer> top = st.peek();
			if(top.size() == capacity) {
				top = new Stack<Integer>();
				top.push(val);
				st.push(top);
				return;
			}
			top.push(val);
			return;
		}
		Stack<Integer> inner = new Stack<Integer>();
		inner.push(val);
		st.push(inner);
	}
	
	public int pop() {
		if(st.isEmpty()) {
			throw new EmptyStackException();
		}
		Stack<Integer> top = st.peek();
		int val = top.pop();
		if(top.isEmpty()) {
			st.pop();
		}
		return val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetOfStacks st = new SetOfStacks();
		st.push(1);
		st.push(2);
		st.push(3);
		st.pop();
		st.pop();
	}
}
