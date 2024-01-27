package arrays;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        List<String> vals = new ArrayList<>();
        vals.add("A");
        vals.add("B");
        List<String> vals1 = new ArrayList<>();
        vals1.add("B");
        vals1.add("C");
        List<List<String>> allVals = new ArrayList<>();
        allVals.add(vals);
        allVals.add(vals1);
        System.out.println(destCity(allVals));
    }
    public static String destCity(List<List<String>> paths) {
        String currCity = "";
        for (List<String> path : paths) {
            if (currCity.equals("")) {
                currCity = path.get(0);
            }
            for (String val : path) {
                System.out.println(val);
            }
        }

        return "";
    }
}