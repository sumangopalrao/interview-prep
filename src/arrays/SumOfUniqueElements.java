// Find the sum of unique elements in the given array
// https://leetcode.com/problems/sum-of-unique-elements/description/ 

package arrays;

public class SumOfUniqueElements {
    
    public static void main(String[] args) {
        SumOfUniqueElements sumOfUniqueElements = new SumOfUniqueElements();
        System.out.println(sumOfUniqueElements.sumOfUnique(new int[]{1, 2, 3, 2}));
        System.out.println(sumOfUniqueElements.sumOfUnique(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println(sumOfUniqueElements.sumOfUnique(new int[]{1, 2, 3, 4, 5}));
    }
    
    public static int sumOfUnique(int[] nums) {
        
        int[] freq = new int[101];
        int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        
        for (int i=0; i<freq.length; i++) {
            if (freq[i] == 1)
            sum += i;
        }
        
        return sum;
    }
    
}