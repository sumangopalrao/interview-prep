function areAlmostEqual(s1: string, s2: string): boolean {

    if(s1.split("").sort().join("") === s2.split("").sort().join("")) {
        let count = 0;
        for(let i=0; i<s1.length; i++) {
            if (s1.charAt(i) !== s2.charAt(i)) {
                count++;
                if (count > 2) {
                    return false;
                }
            }
        }
        return true;
    }
    return false;
};

console.log(areAlmostEqual("abc", "bcd"));