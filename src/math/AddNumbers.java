//LeetCode:: Add two numbers without using the + or - operator
package math;

public class AddNumbers {
	
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		int carry = a & b;
		int sum = a ^ b;
		System.out.println(sum << carry);
	}
}
