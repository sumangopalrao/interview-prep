function carFleet(target: number, position: number[], speed: number[]): number {

    const tuplesArr = position.map((value, index) => {
        return {
            position: value, 
            speed: speed[index]
        };
    });

    tuplesArr.sort((a, b) => a.position - b.position);

    // console.log(tuplesArr);

    const st: number[] = [];

    for (let i = tuplesArr.length - 1; i>=0; i--) {

        st.push(((target - tuplesArr[i].position) / tuplesArr[i].speed));

        if (st.length >= 2 && st[st.length - 1] <= st[st.length - 2]) {
            st.pop();
        }

    }

    return st.length;

};

console.log(carFleet(12, [10,8,0,5,3], [2,4,1,1,3]));