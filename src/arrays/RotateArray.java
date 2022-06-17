package arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println("Rotated array is:");
        int[] out = rotate(arr, 3);
        for (int i : out) {
            System.out.println(i);
        }
    }

    private static int[] rotate(int[] arr, int k) {
        int[] outArr = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            int newPos = (i + k) % arr.length;
            outArr[newPos] = arr[i];
        }
        return outArr;
    }
}
