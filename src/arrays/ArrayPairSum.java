//WAP to find the pair of integers in an array whose sum is k.
//Two variations to return the values itself or to return the indices of the two values.
//LeetCode ADT blog

package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayPairSum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	
        int[] a = {1, 2, 3, 4, 5, 6};
        int sum = 4;
    	int[] values = findPair(a, sum);
    	int[] indices = findIndicies(a, sum);
    	
    	System.out.println("The values are:"+values[0] + "," + values[1]);
    	System.out.println("The indicies are:"+indices[0] + "," + indices[1]);
    }
    
    public static int[] findPair(int[] a, int sum) {
		Set<Integer> set = new HashSet<Integer>();
		int[] res = new int[2];
        
        for(int i=0; i<a.length; i++)
        {
            if(set.contains(sum-a[i])) {
            	res[0] = i;
            	res[1] = sum - a[i];
            	return res;
            }
            else {
                set.add(a[i]);
            }
        }
        return res;
	}

	public static int[] findIndicies(int[] a, int sum) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] res = new int[2];
        
        for(int i=0; i<a.length; i++)
        {
            if(map.containsKey(sum-a[i])) {
            	res[0] = i;
            	res[1] = map.get(sum - a[i]);
            	return res;
            }
            else {
                map.put(a[i], i);
            }
        }
        return res;
	}
}