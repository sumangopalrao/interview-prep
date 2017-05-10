package arrays;
//WAP to replace consecutive characters in a string and replace with the single repeating character. 
//Ex. aaaaabbccdaa = abcda
public class RepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaabbccaaaaa";
		String r = "";
		int i = 0;
		while(i < s.length())
		{
		    r = r+s.charAt(i);
			int j=i+1;
			while(j<s.length() && (s.charAt(j) == s.charAt(i)))
			{
				j++;
			}
			i=j;
			
		}
		
		System.out.println(r);
	}

}
