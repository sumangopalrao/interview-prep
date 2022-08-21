// Leetcode: Return true if the number of occurences in element are unique for all the elements
package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberOfOccurences {

    public static void main(String[] args) {
        int[] arr = new  int[]{-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurences(arr));
    }

    private static boolean uniqueOccurences(int[] arr) {

        Map<Integer, Integer> occurences = new HashMap<>();

        for(Integer i: arr) {

            if (occurences.containsKey(i)) {
                int val = occurences.get(i);
                occurences.put(i, val+1);
            }
            occurences.putIfAbsent(i, 1);
        }

        HashSet<Integer> unique = new HashSet<>();
        for(Map.Entry<Integer, Integer> entry : occurences.entrySet()) {
            if (unique.contains(entry.getValue())) {
                return false;
            }
            unique.add(entry.getValue());
        }
        return true;
    }
}

