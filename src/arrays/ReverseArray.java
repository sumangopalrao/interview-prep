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
		for(int i=0; i<b.length; i++)
		{
		   System.out.println(b[i]);
		}
	}
}