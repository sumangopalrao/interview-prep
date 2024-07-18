// Find if number is valid perfect square
// https://leetcode.com/problems/valid-perfect-square/description/
function isPerfectSquare(num: number): boolean {
    let low = 1;
    let high = num;
    

    if (num == 1)
        return true;
    
    while(low <= high) {
        let mid = Math.floor((low + high) / 2);
        let square = mid * mid;
        
        if (square > num) {
            high = mid - 1;
        } else if (square < num) {
            low = mid+1;
        } else {
            return true;
        }
    }
    
    return false;
    
};

console.log(isPerfectSquare(4));
console.log(isPerfectSquare(5));
console.log(isPerfectSquare(16));
console.log(isPerfectSquare(14));
console.log(isPerfectSquare(1));
console.log(isPerfectSquare(100));