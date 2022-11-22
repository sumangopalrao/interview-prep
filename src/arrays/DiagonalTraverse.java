//Leetcode: Program to traverse the array diagonally
package arrays;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] mat = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[] res = findDiagonalOrder(mat);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    private static int[] findDiagonalOrder(int[][] mat) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] res = new int[mat.length * mat[0].length];
        boolean up = true;
        while (k < mat.length * mat[0].length) {
            res[k] = mat[i][j];
            if (up) {
                if (j == mat[0].length - 1) {
                    i++;
                    up = !up;
                } else if (i == 0) {
                    j++;
                    up = !up;
                } else {
                    i--;
                    j++;
                }
            }

            else {
                if (i == mat.length - 1) {
                    j = j + 1;
                    up = !up;
                } else if (j == 0) {
                    i++;
                    up = !up;
                } else {
                    i++;
                    j--;
                }
            }
            k++;
        }
        return res;

    }
}
