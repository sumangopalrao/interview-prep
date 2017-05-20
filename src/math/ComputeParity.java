package math;

public class ComputeParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int v = ~(n-1);
		System.out.println("V:"+v);
		System.out.println("P:"+(v&n));
		
		int count = 0;
		while(n > 0) {
			int val = n & ~(n-1);
			n = n >> val;
			count = (count+1)%2;
		}
		if(count == 1)
			System.out.println("odd");
		else 
			System.out.println("Even");
	}
}
