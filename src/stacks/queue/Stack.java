//Simple Stack implementation
package stacks.queue;

import java.util.EmptyStackException;

public class Stack<T> {
	 
	private static class StackNode<T> {
		T data;
		StackNode<T> next;
		StackNode(T data) {
			this.data = data;
			next = null;
		}
		
	}
	
	StackNode<T> head;
	
	Stack() {
		head = null;
	}
	
	public void push(T data) {
		StackNode<T> node = new StackNode<T>(data);
		node.next = head;
		head = node;
	}
	
	public void printStack() {
		StackNode<T> top = head;
		while(top != null) {
			System.out.println(top.data);
			top = top.next;
		}
	}
	
	public T peek() {
		if(head == null)
			throw new EmptyStackException();
		return head.data;
	}
	
	public T pop() {
		if(head == null)
			throw new EmptyStackException();
		StackNode<T> top = head;
		head = head.next;
		return top.data;
	}
	
	public boolean isEmpty() {
		return head == null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.printStack();
		System.out.println(st.peek());
		st.pop();
		st.pop();
		st.printStack();
	}

}
