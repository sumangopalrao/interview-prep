//CTCI:: Program to check if string is a permutation of a palindrom
package arrays;

public class PalindromePermutation {
	
	public static boolean isPalindromePermutation(String input) {
		int char_cnt = 0;
		int[] cnt_arr = new int[256];
		for(int i=0; i<input.length(); i++) {
			if(Character.isLetter(input.charAt(i))) {
				char_cnt++;
				int index = input.charAt(i) - 'a';
				cnt_arr[index]++;
			}
		}
		if(char_cnt % 2 == 0) {
			for(int i=0; i<256; i++) {
				if(cnt_arr[i] % 2 != 0)
					return false;
			}
			return true;
		}
		else {
			int one_flag = 0;
			for(int i=0; i<256; i++) {
				if(cnt_arr[i] % 2 != 0) {
					one_flag++;
					if(one_flag > 1)
						return false;
				}
			}
			if(one_flag == 1)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindromePermutation("taco aact"));
	}

}
