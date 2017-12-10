//Own implementation of a string builder 
//CTCI chapter 1 desc.

package design;

public class StringBuilder {
	
	//default used in Java implementation source code
	private static final int length = 16;
	int count;
	char[] arr;
	
	StringBuilder() {
		arr = new char[length];
		count = 0;
	}
	
	StringBuilder(int  capacity) {
		arr = new char[capacity];
		count = 0;
	}
	
	public void append(char a) {
		if(count + 1 > length) {
			char[] new_arr = new char[(arr.length + 1) * 2];
			for(int i=0; i<arr.length; i++) {
				new_arr[i] = arr[i];
			}
			arr = new_arr;
		}
		this.arr[count] = a;
		count++;
	}
	
	@Override
	public String toString() {
		return new String(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		str.append('a');
		str.append('b');
		str.append('c');
		str.append('d');
		str.append('e');
		str.append('f');
		str.append('f');
		System.out.println(str.toString());
	}
}
