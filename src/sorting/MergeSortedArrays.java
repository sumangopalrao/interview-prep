//Given two sorted arrays merge so that one can be added to end of other.
//CTCI 10.1
package sorting;

public class MergeSortedArrays {
	
	public static int[] getSorted(int[] a, int[] b, int lastA, int lastB) {
		
		int i = lastA;
		int j = lastB;
		int lastIndex = a.length-1;
		
		while(j >= 0) {
			if(i >= 0 && a[i] > b[j]) {
				a[lastIndex] = a[i];
				i--;
			}
			else {
				a[lastIndex] = b[j];
				j--;
			}
			lastIndex--;
		}
		//Trying to swap from front to back by moving array to end.
//		System.arraycopy(a, 0, a, b.length, a.length-b.length);
//		int i = 0;
//		int j = 0;
//		int k = b.length;
//		while(j < b.length && k < a.length) {
//			if(a[k] <= b[j]) {
//				a[i] = a[k];
//				k++;
//			}
//			else {
//				a[i] = b[j];
//				j++;
//			}
//			i++;
//		}
//		
//		while( j < b.length && i < a.length) {
//			a[i] = b[j];
//			j++;
//			i++;
//		}
//		
//		while( k < a.length && i < a.length) {
//			a[i] = a[k];
//			k++;
//			i++;
//		}
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[6];
		a[0] = 1;
		a[1] = 3;
		a[2] = 5;
		a[3] = 7;
		//int[] a = new int[]{1, 3, 5, 7, , , , };
		int[] b = new int[]{2, 4};
		int[] out = getSorted(a, b, 3, 1);
		for(Integer i : out) {
			System.out.println(i);
		}
	}

}
