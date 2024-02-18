// WAP to return the factorial of a number
// https://leetcode.com/problems/factorial-generator/description/

function* factorial(n) {
    if (n == 0)
        yield 1;

    let fact = 1;
    for (let i=1; i<=n; i++) {
        fact *= i;
        yield fact;
    }
}

const f = factorial(3);
 
console.log(f.next().value);
