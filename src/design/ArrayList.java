//Program to implement the array list
//CTCI 1

package design;

import java.util.Arrays;

public class ArrayList {
	
	int[] arr = new int[16];
	int count = 0;
	
	public ArrayList() {}
	
	public void add(int value) {
		if(!ensureCapacity()) {
			int[] new_arr = Arrays.copyOf(arr, arr.length*2);
			arr = new_arr;
		}
		arr[count] = value;
		count++;
	}
	
	public void remove() {
		arr[count] = 0;
		count--;
	}
	
	public int get(int index) {
		if(index < 0 || index >= count) {
			throw new IndexOutOfBoundsException();
		}
		return arr[index];
	}
	
	private boolean ensureCapacity() {
		if(count == arr.length - 1) {
			return false;
		}
		return true;
	}
	
	public void printArray() {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.remove();
		list.printArray();

	}

}
