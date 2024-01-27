// Return list of indices where character matches a word.
// https://leetcode.com/problems/find-words-containing-character/

/**
 * @param {string[]} words
 * @param {character} x
 * @return {number[]}
 */
var findWordsContaining = function(words, x) {

    const res = [];

    words.forEach((word, index) => {
        if (word.indexOf(x) !== -1) {
            res.push(index);
        }
    });

    return res;
    
};