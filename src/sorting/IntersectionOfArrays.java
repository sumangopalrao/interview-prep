//Program to compute the intersection of two arrays.
//C14.1 EPI 
package sorting;

public class IntersectionOfArrays {
	
	private static int[] intersect(int[] a, int[] b) {
		int[] out = new int[a.length < b.length ? a.length : b.length];
		int i=0; 
		int j=0;
		int k=0;
		while(i < a.length && j < b.length) {
			if(a[i] == b[j] && (i == 0 || a[i] != a[i-1])) {
				out[k++] = a[i];
				i++;
				j++;
			}
			else if(a[i] < b[j])
				i++;
			else j++;
		}
		return out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] out = intersect(new int[]{1, 1, 1, 2, 4, 5}, new int[]{2, 3, 5});
		for(Integer i : out) {
			System.out.println(i+",");
		}
	}

}
