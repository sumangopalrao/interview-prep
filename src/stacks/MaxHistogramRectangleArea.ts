// Largest rectangle in historgram
// https://leetcode.com/problems/largest-rectangle-in-histogram/description/
// TODO:: NEED REVIEW AND UPDATE CODE

function largestRectangleArea(heights: number[]): number {
    
    let maxArea = 0;
    let st: Array<number[]> = [];
    // console.log("Heights:", heights);
    heights.map((height, index) => {
        let start = index;
        
        while (st.length > 0 && heights[st[st.length - 1] as number] >= height) {
            const value = st.pop();
            
            if (value != null && st[st.length - 1][1] > height) {
                const max = (height * (index - (value[1] as number)));
                maxArea = Math.max(max, maxArea);
                start = value[0];
            }
        }
        st.push([start, height]);
        
    });
    
    while (st.length !== 0) {
        const value = st.pop();
        if (value != null) {
            maxArea = Math.max(value[1] * ((heights.length - 1) - value[0]), maxArea);
        }
    }
    
    return maxArea;
};

console.log(largestRectangleArea([2,1,5,6,2,3]));