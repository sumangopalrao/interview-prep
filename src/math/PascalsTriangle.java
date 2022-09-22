//Leetcode: Given a row number find the Pascal's triangle of the value

package math;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> res = pascals(8);
//        List<List<Integer>> res = pascals(8);
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

        for (int i=1; i < rows; i++) {
            List<Integer> rowValues = new ArrayList<>();

            List<Integer> parentRow = res.get(i - 1);

            rowValues.add(1);

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
