//
//
// function testTimeOutLoop() {
//     const arr = [1, 2, 3, 4, 5, 6];
//
//     for(var i=0; i<arr.length; i++) {
//         (function(arr, i){
//             setTimeout(function() {
//             console.log("The array element at ", i, "is: ", arr[i]);
//             }, 3000);
//         })(arr, i);
//     }
// }
// testTimeOutLoop();
//
//
// var addg = (function () {
//     var count = 0;
//     return function() {
//         return count += 1;
//     }
// })();
//
// addg();
// addg();
// console.log(addg());



//Setup
var contacts = [
    {
        "firstName": "Akira",
        "lastName": "Laine",
        "number": "0543236543",
        "likes": ["Pizza", "Coding", "Brownie Points"]
    },
    {
        "firstName": "Harry",
        "lastName": "Potter",
        "number": "0994372684",
        "likes": ["Hogwarts", "Magic", "Hagrid"]
    },
    {
        "firstName": "Sherlock",
        "lastName": "Holmes",
        "number": "0487345643",
        "likes": ["Intriguing Cases", "Violin"]
    },
    {
        "firstName": "Kristian",
        "lastName": "Vos",
        "number": "unknown",
        "likes": ["Javascript", "Gaming", "Foxes"]
    }
];


function lookUpProfile(firstName, prop){
// Only change code below this line
  console.log("The length:", contacts.length);
  for(var i=0; i<contacts.length; i++) {
    console.log("Name:", contacts[i].firstName, "Given name:", firstName);
    if(contacts[i].firstName === firstName) {
        console.log("Boolean:", contacts[i].hasOwnProperty(prop));
        console.log("Reutrn:", contacts[i].prop);
      if(contacts[i].hasOwnProperty(prop)) {
         return contacts[i].prop;
      }
      return "No such property";
    }
  }
  return "No such contact";

// Only change code above this line
}

// Change these values to test your function
lookUpProfile("Akira", "likes");
