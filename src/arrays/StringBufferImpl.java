//Own implementation of a string buffer
package arrays;

public class StringBufferImpl {
	
	private static final int length = 5;
	int count;
	char[] arr;
	
	StringBufferImpl() {
		arr = new char[length];
		count = 0;
	}
	
	StringBufferImpl(int  capacity) {
		arr = new char[capacity];
		count = 0;
	}
	
	public void append(char a) {
		if(count + 1 > length) {
			char[] new_arr = new char[count + length];
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
		StringBufferImpl str = new StringBufferImpl();
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
