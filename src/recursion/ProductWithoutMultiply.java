//CTCI 8.5 Program to find the product without using the * symbol.
package recursion;

public class ProductWithoutMultiply {
	
	public static int multiply(int a, int b) {
		if(a == 1)
			return b;
		if(b == 1)
			return a;
		if(((a & 1) == 0) && ((b & 1) == 0))
			return multiply(a>>1, b)<<1;
		if((a&1) == 1)
			return b + multiply((a-1), b);
		return a + multiply(a, (b-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiply(2, 2));
	}

}
