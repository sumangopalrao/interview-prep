// Given an array, remove all occurrences of val in nums in-place.
// https://leetcode.com/problems/remove-element/

function removeElement(nums: number[], val: number): number {
    let leftIndex = 0;
    let rightIndex = nums.length - 1;
    while (leftIndex <= rightIndex) {
        if(nums[leftIndex] !== val) {
            leftIndex++;
            continue;
        } 
        if (nums[rightIndex] === val) {
            nums[rightIndex] = -1;
            rightIndex--;
            continue;
        } 
        if (nums[leftIndex] === val){
            nums[leftIndex] = nums[rightIndex];
            rightIndex--;
            leftIndex++;
        } 
    }
    return rightIndex + 1; 
};