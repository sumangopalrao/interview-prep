//Leetcode: Convert a number from its Roman string to its integer equivalent

package math;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {

        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("MCMXCIV"));

    }

    private static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum = 0;
        for (int i = s.length() - 1; i>=0; i--) {
            int val = map.get(s.charAt(i));

            if ((val == 10 || val == 5) && i - 1 >= 0 && s.charAt(i-1) == 'I') {
                val = val - 1;
                i--;
            }

            else if ((val == 100 || val == 50) && i - 1 >= 0 && s.charAt(i-1) == 'X') {
                val = val - 10;
                i--;
            }

            else if ((val == 1000 || val == 500) && i - 1 >= 0 && s.charAt(i-1) == 'C') {
                val = val - 100;
                i--;
            }
            sum += val;
        }
        return sum;
    }
}
