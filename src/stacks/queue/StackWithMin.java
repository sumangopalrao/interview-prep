//Stack which returns the minimum value in O(1).
//CTCI 3.2

package stacks.queue;

public class StackWithMin {
	
	Stack<Tuple> stack;
	int minSoFar = Integer.MAX_VALUE;
	
	StackWithMin() {
		stack = new Stack<Tuple>();
	}
	
	private void push(int val) {
		Tuple t;
		if(val < minSoFar) {
			minSoFar = val;
		}
		t = new Tuple(val, minSoFar);
		stack.push(t);
	}
	
	private void pop() {
		stack.pop();
	}
	
	
	private int getMin() {
		Tuple t = stack.peek();
		return t.getMin();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		StackWithMin st = new StackWithMin();
		
		st.push(3);
		st.push(4);
		st.push(1);
		st.push(2);
		System.out.println(st.getMin());
		st.pop();
		st.pop();
		System.out.println(st.getMin());
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
	}

}
