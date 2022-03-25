// WAP to replace every element with the greatest element to the right of it. -1 for the last element.
// https://leetcode.com/explore/learn/card/fun-with-arrays/511/in-place-operations/3259/

package arrays;

public class ReplaceElementsWIthGreatestElementOnRightSide {
    

	public static void main(String[] args) {

        int[] arr = {17,18,5,4,6,1};
        int[] res = new int[arr.length];

        int n = arr.length;
        res[n-1] = -1;          

        int greatSoFar = -1;
            
        for(int i=n-2; i>=0; i--) {
                
            if (arr[i+1] > greatSoFar) {
                greatSoFar = arr[i+1];
            }
                
            res[i] = greatSoFar;
        }
		
        for (int i=0; i<res.length; i++) {
		    System.out.println(res[i]);
        }
    }
}
