// Find number of senion citizens
// https://leetcode.com/problems/number-of-senior-citizens/description/

function countSeniors(details: string[]): number {
    let count = 0;

    details.map(detail => {
        let age = detail.substring(11, 13);
        if(Number(age) > 60) {
            count++;
        }
        // console.log("Age", age);
    });

    return count;

};


console.log(countSeniors(["7868190130M7522","5303914400F9211","9273338290F4010"]));