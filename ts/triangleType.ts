// Find if the aray forms a triangle and output the triangle type
// https://leetcode.com/problems/type-of-triangle/description/
function triangleType(nums: number[]): string {

    if ((nums[0] + nums[1] > nums[2]) && (nums[1] + nums[2] > nums[0]) && (nums[2] + nums[0] > nums[1])) {
        if ((nums[0] == nums[1]) &&  nums[1] == nums[2] && nums[2] == nums[1]) {
            return "equilateral";
        }

        if(nums[0] != nums[1] && nums[1] != nums[2] && nums[2] != nums[0]) {
            return "scalene";
        }

        return "isosceles";
    }

    return "none";
    
};


console.log(triangleType([1, 2, 3]));
console.log(triangleType([3, 3, 3]));
console.log(triangleType([3, 4, 5]));
console.log(triangleType([8, 4, 2]));