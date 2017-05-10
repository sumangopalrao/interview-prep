package dynamicprogramming;

public class IncreasingTripletSubsequence {
	
	    public static boolean increasingTriplet(int[] nums) {
	        if(nums.length < 3)
	            return false;
	        int lowestSoFarIndex = 0;
	        int secondLowestIndex = -1;
	        if(nums[1] < nums[lowestSoFarIndex])
	            lowestSoFarIndex = 1;
	        else {
	            secondLowestIndex = 1;
	            lowestSoFarIndex = 0;
	        }
	        
	        for(int i=1; i<nums.length; i++) {
	            if(nums[i] < nums[lowestSoFarIndex]) {
	                secondLowestIndex = -1;
	                lowestSoFarIndex = i;
	            }
	            else if(secondLowestIndex == -1 && nums[i] > nums[lowestSoFarIndex]) {
	            	secondLowestIndex = i;
	            }
	            else if(secondLowestIndex != -1 && nums[i] < nums[secondLowestIndex] && nums[i] > nums[lowestSoFarIndex]) {
	                secondLowestIndex = i;
	            }
	            else if(secondLowestIndex != -1 && nums[i] > nums[secondLowestIndex]){
	                return true;
	            }
	        }
	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(increasingTriplet(new int[]{1,2,1,2,1,2,1,2,1,2}));

	}
}
