// Find the number of seconds to fill the cups if only two can be filled together in 1 second and only one cup in 1 second
// https://leetcode.com/problems/minimum-amount-of-time-to-fill-cups/description/

package arrays;

import java.util.Arrays;

public class MinimumTImeToFillCups {
    private static int getTimeToFillCups(int[] amount) {
        int seconds = 0;
        Arrays.sort(amount);
        int highestNum = amount.length-1;
        int secondHighestNum = amount.length-2;
        while (amount[highestNum]>0 && amount[secondHighestNum]>0){
            amount[highestNum]--;
            amount[secondHighestNum]--;
            seconds++;
            Arrays.sort(amount);
        }

        while (amount[highestNum]>0){
            amount[highestNum]--;
            seconds++;
        }
        return seconds;

    }
    
    public static void main(String[] args) {
        System.out.println(getTimeToFillCups(new int[]{1,4,2}));
        System.out.println(getTimeToFillCups(new int[]{5,4,4}));
    }
}
