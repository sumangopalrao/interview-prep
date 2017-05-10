/*** Program to remove characters from string such as a and bc **/

package arrays;

public class RemoveChars {
	
	static char[] arr;
	
	public static String removeChars(String input) {
		arr = input.toCharArray();
		int i=0;
		while(i<input.length()) {
			if(isValid(arr, i))
				continue;
			else if(arr[i] == 'a') {
				for(int nextValidIndex = i+1; nextValidIndex < input.length(); nextValidIndex++) {
					if(isValid(arr, nextValidIndex)) {
						swap(arr, i, nextValidIndex);
						break;
					}
				}
			}
			else if(arr[i] == 'b' && (i+1)<arr.length && arr[i+1] == 'c') {
				for(int nextValidIndex = i+2; nextValidIndex < input.length(); nextValidIndex++) {
					if(isValid(arr, nextValidIndex)) {
						swap(arr, i, nextValidIndex);
						i++;
					}
				}
			}
			i++;
		}
		return new String(arr);
	}
	
	public static boolean isValid(char[] x, int index) {
		if(x[index] == 'a')
			return false;
		if(x[index] == 'b' && (index+1)<x.length && x[index+1] == 'c')
			return false;
		return true;
	}
	
	public static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeChars("aabscsbc"));
	}
}