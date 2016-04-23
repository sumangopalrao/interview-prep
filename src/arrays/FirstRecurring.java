package arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstRecurring {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int max = -1;
        int a[] = { 1, 1, 2, 3, 5, 4, 2, 6};
        Set<Integer> val = new HashSet<Integer>();
        for(int i=a.length-1; i>=0; i--)
        {
           if(val.contains(a[i])) 
           {
               max=i;
           }
           else 
           {
               val.add(a[i]);
           }
        }
            if(max != -1)
            {
                System.out.println("The first index is"+ (max+1));
            }
            else 
                System.out.println("Not found");
            

    }

}
