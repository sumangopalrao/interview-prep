//LeetCode:: Self dividing numbers
package math;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
	
public static List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> res = new ArrayList<Integer>();
        for(int i=left; i<=right; i++) {
            if(isSelfDividing(i)) {
                res.add(i);
            }
        }
        return res;
    }
    
    public static boolean isSelfDividing(int num) {
        int orig = num;
        while(num > 0) {
            int r = num%10;
            if(r == 0)
                return false;
            if(orig % r != 0)
                return false;
            num = num/10;
        }
        return true;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(Integer i : selfDividingNumbers(1, 22)) {
			System.out.println(i);
		}
	}
}
