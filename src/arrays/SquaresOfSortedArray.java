package arrays;

public class SquaresOfSortedArray {

    public static int[] findSortedSquares(int[] arr) {
        int[] output = new int[arr.length];
        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        int i = output.length - 1;
        while (i>=0) {
            int square;
            if (Math.abs(arr[leftPointer]) > Math.abs(arr[rightPointer])) {
                square = arr[leftPointer];
                leftPointer++;
            } else {
                square = arr[rightPointer];
                rightPointer--;
            }
            output[i] = square * square;
            i--;
        }
        return output;
    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {-7,-3,2,3,11};
        for (int val : findSortedSquares(arr)) {
            System.out.println(val);
        }
	}
    
}
