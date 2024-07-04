// Find the gap between two ones in a binary number
// https://leetcode.com/problems/binary-gap/

function binaryGap(n: number): number {
    let result = 0;

    const binary = n.toString(2);

    let start = 0;

    for(let i=0; i<binary.length; i++) {
        if(binary[i] === '1') {
            result = Math.max(result, i-start);
            start = i;
        }
    } 

    return result
}

console.log(binaryGap(22));