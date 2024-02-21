// Given a string of words, return a new string that has only the first K words
// https://leetcode.com/problems/truncate-sentence/

function truncateSentence(s: string, k: number): string {
    return s.split(" ").slice(0, k).join(" ");
};
