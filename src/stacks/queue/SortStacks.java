// Program to sort a stack.
//CTCI 3.5

package stacks.queue;

import java.util.EmptyStackException;
import java.util.Stack;

public class SortStacks {
	
	Stack<Integer> stA = new Stack<Integer>();
	Stack<Integer> stB = new Stack<Integer>();
	
	public void push(int val) {
		if(stB.isEmpty()) {
			stB.push(val);
		}
		else {
			if(val >= stB.peek()) {
				stB.push(val);
			}
			else {
				while(!stB.isEmpty() && val < stB.peek()) {
					stA.push(stB.pop());
				}
				stB.push(val);
				while(!stA.isEmpty()) {
					stB.push(stA.pop());
				}
			}
		}
	}
	
	public int pop() {
		while(!stB.isEmpty()) {
			stA.push(stB.pop());
		}
		
		if(stA.isEmpty()) {
			throw new EmptyStackException();
		}
		int val = stA.pop();
		while(!stA.isEmpty()) {
			stB.push(stA.pop());
		}
		return val;
	}
	
	public boolean isEmpty() {
		return stA.isEmpty() && stB.isEmpty();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortStacks st = new SortStacks();
		st.push(5);
		st.push(3);
		st.push(2);
		st.push(4);
		st.push(1);
		System.out.println(st.pop());
		System.out.println(st.pop());

	}

}
