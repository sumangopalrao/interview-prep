//WAP to reverse an array. 
package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 4, 3, 5};
		int[] b = new int[a.length];
		int j=0;
		for(int i=a.length-1; i>=0; i--)
		{
			b[j++] = a[i];
		}
		for (int k : b) {
			System.out.println(k);
		}
	}
}
