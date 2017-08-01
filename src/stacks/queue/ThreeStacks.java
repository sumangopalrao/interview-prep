//Implement three stacks using a single array.
//CTCI 3.1
package stacks.queue;

public class ThreeStacks {
	
	int[] values;
	int[] sizes;
	int i;
	int j;
	int k;
	
	ThreeStacks(int capacity) {
		values = new int[capacity*3];
		sizes = new int[3];
	}
	
	public void push(int val, int num) {
		sizes[num]++;
		values[getIndex(num)] = val;
	}
	
	public int pop(int num) {
		int val = values[getIndex(num)];
		sizes[num]--;
		return val;
	}
	
	public int getIndex(int num) {
		int off = num * 3;
		return off + sizes[num] - 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreeStacks stack = new ThreeStacks(4);
		stack.push(1, 1);
		stack.pop(1);
	}
}
