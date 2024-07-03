// Calculate the time the train is delayed by.
// https://leetcode.com/problems/calculate-delayed-arrival-time/description/

function findDelayedArrivalTime(arrivalTime: number, delayedTime: number): number {

    const finalTimeSum = arrivalTime + delayedTime;
    if (finalTimeSum < 24)
        return finalTimeSum;

    return finalTimeSum % 24;

};

console.log(findDelayedArrivalTime(13, 11));
console.log(findDelayedArrivalTime(15, 5));
console.log(findDelayedArrivalTime(20, 7));