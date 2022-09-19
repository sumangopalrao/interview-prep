//Program to print the first n fibonacci numbers
package math;

public class FibonacciSeries {

	public static void printFib(int n) {
		if(n >= 1)
			System.out.println(0);
		if(n >= 2)
			System.out.println(1);
		int a = 0;
		int b = 1;
		for(int i=2; i<=n; i++) {
			int c = a+b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

	public static int fib(int n) {
		if (n == 0)
			return 0;

		if (n == 1)
			return 1;

		return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		printFib(n);
		System.out.println(fib(5));
		

	}

}
