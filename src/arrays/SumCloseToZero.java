//WAP to print the two elements of an array whose sum is closest to zero. 
package arrays;

import java.util.Arrays;

public class SumCloseToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-4, 4, 1, 2, -5, 1};
		
		Arrays.sort(a);
		
		int sum;
		int min_sum, min_l, min_r;
		int l=min_l=0;
		int r=min_r=a.length-1;
        min_sum=Integer.MAX_VALUE;
		while (l<r)
		{
			sum = a[l] + a[r];
			if(Math.abs(sum) < Math.abs(min_sum))
			{
				min_sum = sum;
				min_l = l;
				min_r = r;
			}
			else if(sum > 0)
				r--;
			else 
				l++;
		}
		System.out.println("Left" + a[min_l] + "Right:" + a[min_r]);

	}

}
