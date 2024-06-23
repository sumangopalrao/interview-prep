// Problem: Find if two strings are almost equivalent
// https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/description/
// Runtime: O(n)


function checkAlmostEquivalent(word1: string, word2: string): boolean {
    const cnt1 = Array(26).fill(0);
    const cnt2 = Array(26).fill(0);
    
    for(let i=0; i<word1.length; i++) {
        cnt1[word1.charCodeAt(i) - 'a'.charCodeAt(0)]++;
        cnt2[word2.charCodeAt(i) - 'a'.charCodeAt(0)]++;
    }

    for(let i=0; i<26; i++) {
        if(Math.abs(cnt1[i] - cnt2[i]) > 3) {
            return false;
        }
    }

    return true;
};

console.log(checkAlmostEquivalent("aaaa", "bccb"));
console.log(checkAlmostEquivalent("abcdeef", "abaaacc"));
console.log(checkAlmostEquivalent("cccddabba", "babababab"));
