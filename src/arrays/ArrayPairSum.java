package arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayPairSum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] a = {1, 2, 3, 4, 5, 6};
        int sum = 4;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i=0; i<a.length; i++)
        {
            if(map.containsKey(sum-a[i]))
                System.out.println("Yes"+ a[i]+ "" + (sum-a[i]));
            else {
                map.put(a[i], sum-a[i]);
            }
        }
        System.out.println("No");

    }

}
