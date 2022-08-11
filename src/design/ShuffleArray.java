//Leetcode: Given an array of integers, shuffle them so that they have equal probability of shuffling order.

package design;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

    int[] origArray;
    int[] shuffledArray;

    public static void main(String[] args) {
        ShuffleArray arr = new ShuffleArray(new int[]{1, 2, 3, 4});
        int[] shuffled = arr.shuffle();
        arr.printArray(shuffled);
        System.out.println();
        int[] resetArr = arr.reset();
        arr.printArray(resetArr);
        System.out.println();
        shuffled = arr.shuffle();
        arr.printArray(shuffled);
    }

    public ShuffleArray(int[] nums) {
        origArray = Arrays.copyOf(nums, nums.length);
    }

    public int[] reset() {
        shuffledArray = Arrays.copyOf(origArray, origArray.length);
        return shuffledArray;
    }

    public int[] shuffle() {
        shuffledArray = Arrays.copyOf(origArray, origArray.length);
        Random random = new Random();
        for (int i=0; i<origArray.length; i++) {
            int next =  random.nextInt(origArray.length);
            int temp = shuffledArray[i];
            shuffledArray[i] = shuffledArray[next];
            shuffledArray[next] = temp;
        }
        return shuffledArray;
    }

    private void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }
}
