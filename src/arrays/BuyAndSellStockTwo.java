// Leetcode:   Best Time to Buy and Sell Stock II

package arrays;

public class BuyAndSellStockTwo {

    private static int maxGain(int[] arr) {
        int total_gain = 0;
        for (int i=0; i<arr.length - 1; i++) {
            int curr = arr[i];
            if(curr < arr[i+1]) {
                int diff = arr[i+1] - curr;
                total_gain += diff;
            }
        }
        return total_gain;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = new int[]{7,1,5,3,6,4};
        System.out.println(maxGain(arr));
        System.out.println(maxGain(new int[]{1,2,3,4,5}));
        System.out.println(maxGain(new int[]{7,6,4,3,1}));
    }

}
