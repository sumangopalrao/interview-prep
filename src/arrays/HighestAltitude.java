// Given a list of altitude gains, find the maximum height.
// https://leetcode.com/problems/find-the-highest-altitude/description/

package arrays;

public class HighestAltitude {

    private static int maxAltitude(int[] gain) {
        int maxHeight = 0;
        int sum = 0;

        for (int i=0; i<gain.length; i++) {
            sum += gain[i];
            if (sum > maxHeight) {
                maxHeight = sum;
            }
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        System.out.println(maxAltitude(new int[]{-5,1,5,0,-7}));
        System.out.println(maxAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }
}
