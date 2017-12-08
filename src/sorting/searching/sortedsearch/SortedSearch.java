//Sorted Search without Size 
//CTCI 10.4

package sorting.searching.sortedsearch;

public class SortedSearch {
	
	static Listy listy;
	
	public static int findElement(int elem) {

		int len = 1;
		while(listy.elementAt(len) != -1 && listy.elementAt(len) < elem) {
			len *= 2;
		}
		return binarySearch(0, len, elem);
		
	}
	
	private static int binarySearch(int start, int end, int elem) {
		while(start <= end) {
		    int mid = (start + end)/2;
			if(listy.elementAt(mid) == elem) {
				return mid+1;
			}
			else if(listy.elementAt(mid) < elem && listy.elementAt(mid) != -1) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {5, 8, 9, 12, 14, 18, 20};
		int elem = 5;
		listy = new Listy(arr);
		
		System.out.println("The element is at:"+ findElement(elem));
		
	}
}
