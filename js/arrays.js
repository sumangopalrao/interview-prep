// create an array of n elements and print the contents of the array

let arr = [1, 2, 3, 4, 5, 6, 7];

// going through array with forEach
arr.forEach((a) => {
  //   console.log(a);
});

// going through array with for loop
for (let i = 0; i < arr.length; i++) {
  //   console.log(arr[i]);
}

// insert at 0th position
function insertAtZeroth(val) {
  let res = [];
  res.push(val);

  for (let i = 0; i < arr.length; i++) {
    res.push(arr[i]);
  }
  return res;
}
// console.log(insertAtZeroth(100));

// insert element at ith position in array
let i = 3;

function insertAt(index, val) {
  let insertedArray = [];
  let i = 0;
  while (i < arr.length) {
    console.log(arr[i]);
    if (i == index) {
      insertedArray.push(val);
    }
    insertedArray.push(arr[i]);
    i++;
  }
  return insertedArray;
}

console.log(insertAt(4, 101));

// console.log(insertAt(3, "test"));
