//Leetcode: Find the power of a raised to b

package math;

public class PowerOfTwoNums {
	public static int pow(int a, int b) {
	    if(b == 0)
	        return 1;
	    int res = 1;
	    while(b != 0) {
	        res *= a;
	        b--;
	    }
	    return res;
	}


	public static float power(int a, int b) {
	     if(b == 0)
	         return 1;
	     float res = 1;
	     boolean neg = false;
	     if(b < 0) {
	         neg = true;
	         b *= -1;
	     }
	     while(b != 0) {
	         res *= a;
	         b--;
	     }
	     if(neg) {
	         return (float) 1/res;
	     }
	     return res;
	}


	public static float powerRec(int a, int b) {
	    if(b == 0)
	        return 1;
	    float res = powerRec(a, b/2);    
	    if(b%2 == 0) {
	        return res*res;
	    }
	    else {
	        if(b <= 0)
	            return (res*res)/a;
	        else 
	            return a*res*res;
	    }
	}
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2, 4));
		System.out.println(power(2, 4));
		System.out.println(powerRec(2, -4));
	}

}
