//Program to check if string3 is a combination of string1 and string2 in same order of characters as present in original. 
//Taken from http://www.ardendertat.com/2011/10/10/programming-interview-questions-6-combine-two-strings/
//Can cache it to increase the performance. 

package recursion;

public class CombineTwoStrings {

	static boolean isShuffle(String s1, String s2, String s3) {
		if(s1.length() == 0 && s2.length() == 0  && s3.length() == 0)
			return true;
		if(s1.length() + s2.length() != s3.length()) {
			return false;
		}
		if(s1.length() != 0 && s3.charAt(0) == s1.charAt(0)) {
			return isShuffle(s1.substring(1), s2, s3.substring(1));
		}
		else if(s2.length() != 0 && s3.charAt(0) == s2.charAt(0)) {
			return isShuffle(s1, s2.substring(1), s3.substring(1));
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "n  me t? e can";
		String s2 = "CaweergiYes, w!";
		String s3 = "Can we merge it? Yes, we can!";
		System.out.println(isShuffle(s1, s2, s3));
	}

}
