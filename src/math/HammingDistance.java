// Leetcode: Find the Hamming distance between two numbers: Hamming distance is the number of bits that are different between the two numbers

package math;

public class HammingDistance {

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
        System.out.println(hammingDistance(3, 1));
    }
    public static  int hammingDistance(int x, int y) {
        return hammingWeight(x ^ y);
    }
    public static int hammingWeight(int n) {
        int count = 0;
        for(int i=1; i<33; i++) {
            if((n & (1 << i)) != 0) {
                count++;
            }
        }
        return count;
    }
}
