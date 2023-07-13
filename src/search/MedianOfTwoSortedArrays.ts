// Find the median of two sorted arrays
// https://leetcode.com/problems/median-of-two-sorted-arrays/description/

export function findMedianSortedArrays(nums1: number[], nums2: number[]): number {
    
    let a = [...nums1];
    let b = [...nums2];
    
    const total = a.length + b.length;
    const half = Math.floor(total / 2);
    
    if (b.length < a.length) {
        [a, b] = [b, a];
    }
    
    let l = 0;
    let r = a.length;
    
    while (l <= r) {
        const i = Math.floor((l + r) / 2);
        const j = half - i;
        
        const Aleft = i > 0 ? a[i - 1] : -Infinity;
        const Aright = i < a.length ? a[i] : Infinity;
        const Bleft = j > 0 ? b[j - 1] : -Infinity;
        const Bright = j < b.length ? b[j] : Infinity;
        
        if (Aleft <= Bright && Bleft <= Aright) {
            if (total % 2 === 0) {
                return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
            } else {
                return Math.min(Aright, Bright);
            }
        } else if (Aleft > Bright) {
            r = i - 1;
        } else {
            l = i + 1;
        }
    }

    return -1;
    
    
    // let a = nums1;
    // let b = nums2;
    
    // const len1 = nums1.length;
    // const len2 = nums2.length;
    
    // const total =len1 + len2;
    // const half = total / 2;
    
    // if (len2 < len1) {
    //     let temp = a;
    //     a = b;
    //     b = temp;
    // }
    
    // let l = 0;
    // let r = a.length - 1;
    // let Aleft;
    // let Aright;
    // let Bleft;
    // let Bright;
    // while(true) {
    //     let i = l + (r - l) / 2;
    //     let j = half - i - 2;
    
    //     if (i >= 0)
    //         Aleft = a[i];
    //     else Aleft = -Infinity;
    
    //     if (i + 1 < a.length)
    //         Aright = a[i+1];
    //     else 
    //         Aright = Infinity;
    
    //     if (j >= 0)
    //         Bleft = b[j];
    //     else 
    //         Bleft = -Infinity;
    
    //     if ( j+1 < b.length) 
    //         Bright =  b[j + 1];
    //     else 
    //         Bright = Infinity;
    
    
    //     if (Aleft <= Bright && Bleft <= Aright) {
    //         if (total % 2 == 0)
    //             return Math.min(Aright, Bright);
    
    //         return (Math.max(Aleft, Bleft) +  Math.min(Aright, Bright)) / 2;
    //     } else if(Aleft > Bright) {
    //         r = i - 1;
    //     }
    //     else {
    //         l = i + 1;
    //     }
    // }
    
};

console.log(findMedianSortedArrays([1, 3], [2]));