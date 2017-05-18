package arrays;

public class CheckUnique {
   public static boolean check(String val) {
        int checker = 0;
	for(int i=0; i<val.length(); i++) {
	    if((checker & (1 << (val.charAt(i) - 'a'))) > 0)
		return false;
	    checker = checker | (1 << val.charAt(i) - 'a');
	}
	return true;
   }
   public static void main(String[] args) {
       System.out.println(check("val"));
   }
}
