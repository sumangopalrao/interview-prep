//WAP to convert a decimal number to its binary. 
import java.util.Stack;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 9;
		Stack<Integer> res = new Stack<Integer>();
		
		while (n>0)
		{
			int rem = n%2;
			res.push(rem);
			n = n/2;
		}
		String val = "";
		while (!res.empty())
		{
			val = val + res.pop() ;
		}
	    System.out.println("The out is"+ val);

	}

}
