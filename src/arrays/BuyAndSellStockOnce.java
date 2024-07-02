// EPI 6.6 -- Buy and sell stock once
// Leetcode: Best time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

package arrays;

public class BuyAndSellStockOnce {
	
	private static int maxGain(int[] arr) {
		int lowest_so_far = Integer.MAX_VALUE;
		int max_gain = 0;
		for (int j : arr) {
			if (j < lowest_so_far) {
				lowest_so_far = j;
			} else if (j > lowest_so_far) {
				int gain = j - lowest_so_far;
				if (gain > max_gain)
					max_gain = gain;
			}
		}
		return max_gain;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{310, 315, 275, 295, 260, 270, 290, 230, 255, 250};
		System.out.println(maxGain(arr));
	}

}
