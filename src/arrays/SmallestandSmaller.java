//WAP to print the smallest and the second smallest element in an array. 
package arrays;

public class SmallestandSmaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 6, 4, 3, 1, 5};
		int lowest=a[0];
		int lower=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i] < lowest)
			{
				lower = lowest;
				lowest = a[i];
			}
			else if(a[i] < lower)
			{
				lower = a[i];
			}
		}
		System.out.println("Lowest:" + lowest);
		System.out.println("Second Lowest:" + lower);

	}

}
