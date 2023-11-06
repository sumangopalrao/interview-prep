// Given an array of strings, encode and decode it so that we get back the original string.
/**
 * Encodes a list of strings to a single string.
 */
function encode(strs: string[]): string {

    let encodedString = "";
    const DELIMITER = "#";
    strs.forEach(str => {
        const len = str.length;
        encodedString = encodedString.concat(String(len)).concat(DELIMITER).concat(str);
    })
    return encodedString;
	
};

/**
 * Decodes a single string to a list of strings.
 */
function decode(s: string): string[] {
    console.log("Encoded string is", s);

    let decodedString = [];

    for (let i = 0; i<s.length; ) {
        let len;
        let j = i;
        while (s[j] !== '#') {
            j++;
        }
        len = parseInt(s.slice(i, j), 10);
        console.log("Length is", len);
        const str = s.slice(j+1, j+1+len);
        i = j+1+len;
        decodedString.push(str);
    }
    return decodedString;
	
};

/**
 * Your functions will be called as such:
 * decode(encode(strs));
 */

console.log(decode(encode(["hello", "world"])));
console.log(decode(encode([""])));
console.log(decode(encode(["63/Rc","h","BmI3FS~J9#vmk","7uBZ?7*/","24h+X","O "]))); // ["63/Rc","h","BmI3FS~J9#vmk","7uBZ?7*/","24h+X","O "]