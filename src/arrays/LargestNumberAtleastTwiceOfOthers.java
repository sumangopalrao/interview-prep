// Leetcode:: Find the index of largest number in array such that it is atleast twice of others
package arrays;

public class LargestNumberAtleastTwiceOfOthers {

    public static void main(String[] args) {
        int[] arr = { 0, 0, 3, 2 };
        System.out.println(findLargestIndex(arr));
    }

    public static int findLargestIndex(int[] arr) {
        if (arr.length == 0)
            return -1;
        if (arr.length == 1)
            return arr[0];
        int largest = arr[0];
        int largestIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                largestIndex = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == largestIndex)
                continue;
            if (arr[i] > largest / 2) {
                return -1;
            }
        }

        return largestIndex;
    }

}
