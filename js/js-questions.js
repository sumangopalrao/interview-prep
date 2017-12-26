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
//lookUpProfile("Akira", "likes");



function whatIsInAName(collection, source) {
  // What's in a name?
  var arr = [];
  // Only change code below this line
  collection.some(function(f) {
      console.log("Input:", f);
      var flag = true;
      Object.keys(source).forEach(function(k) {
           console.log("K:", k, "and: f", f);
           console.log(f.hasOwnProperty(k));
           console.log(f[k]);
           console.log(source[k]);
          if(!f.hasOwnProperty(k) || f[k] !== source[k]) {
            flag = false;
          }
      });
      if(flag === true) {
         arr.push(f);
      }
  });

  console.log(source["abc"]);
  // Only change code above this line
  console.log("Output:");
  console.log(arr);
  return arr;
}

//whatIsInAName([{ first: "Romeo", last: "Montague" }, { first: "Mercutio", last: null }, { first: "Tybalt", last: "Capulet" }], { last: "Capulet" });



function myReplace(str, before, after) {
  var arr = str.split(" ");
  var cpy = [];
  arr.forEach(function(f) {
    if(f === before) {
      for(var i=0; i<f.length; i++) {
        if(f.charAt(i) === f.charAt(i).toUpperCase()) {
            console.log("Came here");
            after = after.charAt(i).toUpperCase() + after.slice(1);
          // after.replace(before.charAt(i), before.charAt(i).toUpperCase());
        }
      }
      cpy.push(after);
    }
    else {
      cpy.push(f);
    }
  });
  console.log(cpy);
  return cpy.join();
}

myReplace("A quick brown fox Jumped over the lazy dog", "Jumped", "leaped");
