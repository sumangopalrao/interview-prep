// Generator function to create fibonacci sequence
// https://leetcode.com/problems/generate-fibonacci-sequence/

/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let a = 0;
    let b = 1;

    while(true) {
        yield a;
        const temp = a;
        a = b;
        b += temp;
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */