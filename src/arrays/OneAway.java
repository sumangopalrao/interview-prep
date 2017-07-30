//Given two strings find if they are one edit/delete/add away.
//CTCI 1.5
package arrays;

public class OneAway {
	
	private static boolean compareStrings(String s1, String s2) {
		if(Math.abs(s1.length() - s2.length()) > 1) {
			return false;
		}
		
		int count_diff = 0;
		int i = 0;
		int j = 0;
			while(i < s1.length() && j < s2.length()) {
				if(s1.charAt(i) != s2.charAt(j)) {
					count_diff++;
					if(s1.length() > s2.length())
						i++;
					else if(s1.length() < s2.length())
						j++;
					else {
						i++;
						j++;
					}
					if(count_diff > 1) 
						return false;
				}
				else {
					i++;
					j++;
				}
				
			}
			return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(compareStrings("pale", "apale"));
		

	}

}
