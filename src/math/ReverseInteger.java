//Program to reverse an integer handling - and 0 cases.
//LeetCode  7

package math;

public class ReverseInteger {
	
	public static int reverse(int x) {
        if(x == 0)
            return 0;
        boolean negative = false;
        if(x < 0) {
            negative = true;
            x = Math.abs(x);
        }
        
        long out = 0;
        while(x % 10 == 0) {
            x = x/10;
        }
        
        while(x > 0) {
            int r = x%10;
            out = out*10+r;
            if(out > Integer.MAX_VALUE)
                return 0;
            x = x/10;
        }
        if(negative) 
            return (int) out*-1;
        return (int) out;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(1234));
		System.out.println(reverse(-1234));
		System.out.println(reverse(1234000));
	}
}
