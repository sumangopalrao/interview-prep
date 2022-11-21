package arrays;

public class DiagonalTraverse {
    public static void main(String[] args) {
        int[][] mat = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[] res = findDiagonalOrder(mat);

    }

    private static int[] findDiagonalOrder(int[][] mat) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] res = new int[mat.length * mat[0].length];
        boolean up = true;
        while (i < mat.length && j < mat[0].length) {
            int val = mat[i][j];
            if (up) {
                if (j == mat[0].length - 1) {

                    up = false;
                }

            }

        }
    }
}
