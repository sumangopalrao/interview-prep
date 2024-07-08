// Find the second highest digit in alphannumeric string
// https://leetcode.com/problems/second-largest-digit-in-a-string/description/

function secondHighest(s: string): number {

    const digits = new Set<number>();

    for(let i=0; i<s.length; i++) {
        if(!isNaN(Number(s.charAt(i)))) {
            // digits.push(s.charCodeAt(i) - '0'.charCodeAt(0));
            digits.add(Number(s.charAt(i)));
        }
    }

    const res = new Array(...digits).sort();

    console.log(digits);

    if (digits.size >= 2) {
        return res[digits.size - 2];
    }
    
    return -1
};