package sorting.searching;

public class CountNegativeNumbers {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

        System.out.println("Count negative ones: " + countOnes(matrix));
    }

    private static int countOnes(int[][] matrix) {
        int count = 0;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] <= -1) {
                    count++;
                }
            }
        }
        return count;
    }
}
