package math;
//LeetCode: WAP where input n is given. Print the number of 1's in the binary representation for each digit i 0ton. 
public class CountOnesInBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		int x=0;
		int closesttwo = 0;
		int[] res = new int[n+1];
		res[0] = 0;
		for(int i=1; i<=n; i++)
		{
		    if(Math.pow(2, x) == i)	
		    {
		    	res[i] = 1;
		    	closesttwo = (int) Math.pow(2, x);
		    	x++;
		    }
		    else {
		        res[i] = res[(i-closesttwo)] + 1; 
		    }
		}
		for(int j=0; j<res.length; j++)
		{
		    System.out.println("The output array"+ res[j]);
		}

	}

}
