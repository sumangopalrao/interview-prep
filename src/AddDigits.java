//LeetCode :: Add the digits in a number till you get a single digit
public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		System.out.println(addDigits(1232132));

	}
	
	    public static int addDigits(int num) {
	        if(num < 10)
	             return num;
	        
	        int rem = num%10;
	        int sum = rem + addDigits(num/10);
	        
	        int finalsum;
	        if(sum < 10)
	              finalsum = sum;
	        else 
	             finalsum = addDigits(sum);
	             
	         return finalsum;
	        
	    }

}
