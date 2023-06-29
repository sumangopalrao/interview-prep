// Koko eating bananas, given piles of bananas and the number of hours `h` where the guards are way,
// find the minimum number of hours k during which Koko can eat the bananas
// https://leetcode.com/problems/koko-eating-bananas/description/

function minEatingSpeed(piles: number[], h: number): number {

    let left = 1;
    let right = Math.max(...piles);
    let minEatingSpeed = Infinity;

    while(left <= right) {
        let k = Math.floor(right - ((right - left) / 2));
        let countUsingK = findCount(piles, k);
        if (countUsingK <= h) {
            minEatingSpeed = Math.min(k, minEatingSpeed);
            right = k - 1;
        } else {
            left = k + 1;
        }
    }

    return minEatingSpeed;
};

function findCount(piles: number[], k: number): number {
    let count = 0;
    piles.forEach(pile => {
        count += Math.ceil(pile / k);
    });

    return count;
}

console.log(minEatingSpeed([3, 6, 7, 11], 8));
console.log(minEatingSpeed([30, 11, 23, 4, 20], 5));
console.log(minEatingSpeed([30, 11, 23, 4, 20], 6));
console.log(minEatingSpeed([312884470], 312884469));
