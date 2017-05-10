/*** Program to reverse the vowels in a string **/
package arrays;

public class ReverseVowels {
	
	public static String reverseVowels(String s) {
		int i = 0;
		int j = s.length()-1;
		char[] arr = s.toCharArray();
		while(i<j) {
			if(isVowel(arr[i]) && isVowel(arr[j])) {
				char temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			else if(isVowel(arr[i])) {
				j--;
			}
			else if(isVowel(arr[j])) {
				i++;
			}
			else {
				i++;
				j--;
			}
		}
		return new String(arr);
	}
	
	static boolean isVowel(char x) {
		if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')
			return true;
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseVowels("hello"));
	}

}
