//Leetcode: Given a row number find the Pascals triangle of the value
package math;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        List<List<Integer>> res = pascals(8);
        for (List<Integer> r : res) {
            for (Integer s : r) {
                System.out.print(s + ",");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> pascals(int rows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        res.add(row1);
        if (rows == 1) {
            return res;
        }

        List<Integer> row2 = new ArrayList<>();
        row2.add(1);
        row2.add(1);
        res.add(row2);
        if (rows == 2) {
            return res;
        }

        for (int i=2; i < rows; i++) {
            List<Integer> rowValues = new ArrayList<>();
            rowValues.add(1);
            List<Integer> parentRow = res.get(i - 1);
            for (int j = 1; j < i; j++) {
                int sumVal =  parentRow.get(j - 1) + parentRow.get(j);
                rowValues.add(sumVal);
            }
            rowValues.add(1);
            res.add(rowValues);
        }
        return res;
    }
}
