// Find the maximums of all windows of lenth k
// https://leetcode.com/problems/sliding-window-maximum/description/
// TODO:: NEED REVISION 

var bruteForce = function maxSlidingWindow(nums: number[], k: number): number[] {
    const res = [];
    for (let i=0; i<=nums.length - k; i++) {
        let max = -Infinity;
        for (let j=0; j<k; j++) {
            if (nums[i + j] > max) {
                max = nums[i+j];
            }
        }
        res.push(max);
    }
    console.log('Result', res);
    return res;
};

var deque = function maxSlidingWindow(nums: number[], k: number): number[] {
    const res = [];
    const q: number[] = [];
    let l = 0;
    let r = 0;

    while (r < nums.length) {
        while (q.length > 0 && nums[q[q.length - 1]] < nums[r]) {
            q.pop();
        }

        q.push(r);

        if (l > q[0]) {
            q.shift();
        }

        if ((r + 1 ) >= k) {
            res.push(nums[q[0]]);
            l += 1;
        }

        r += 1;
    }

    return res;

};

(bruteForce([1, 3, 4, 5], 3).forEach(val => {
    console.log(val, ",");
}));

(deque([1, 3, 4, 5], 3).forEach(val => {
    console.log(val, ",");
}));
