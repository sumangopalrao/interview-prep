package arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println("Rotated array is:");
        int[] out = rotateInPlace(arr, 3);
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

    private static int[] rotateInPlace(int[] arr, int k) {
        if (k == 0 || arr.length == 1)
            return arr;
        if (k > arr.length)
            k = k % arr.length;
        int[] reverseArray = reverseSubArray(arr, 0, arr.length - 1);
        reverseSubArray(reverseArray, 0, k - 1);
        reverseSubArray(reverseArray, k, arr.length - 1);
        return reverseArray;
    }

    private static int[] reverseSubArray(int[] arr, int startIndex, int endIndex) {
        int n = arr.length - 1;
        for (int i=startIndex; i<=(startIndex + endIndex) / 2; i++) {
            int swap = arr[i];
            arr[i] = arr[startIndex + endIndex - i];
            arr[startIndex + endIndex - i] = swap;
        }
        return arr;
    }
}
