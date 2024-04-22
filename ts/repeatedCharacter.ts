// Problem: Find the first repeated character in a string
// https://leetcode.com/problems/first-letter-to-appear-twice/description/
// Runtime: O(n)

function repeatedCharacter(s: string): string {
    const map: { [key: string]: boolean } = {};

    for (let i = 0; i<s.length; i++) {

        const key: string = s.charAt(i);
        if (map.hasOwnProperty(key)) {
            return key;
        }
        map[key] = true;
    }

    return "";
    
};