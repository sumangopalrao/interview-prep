var makeAdder = function(x) {
    function add(y) {
        return x+y;
    }
    return add;
}


var oneAdder = makeAdder(1);
console.log(oneAdder(2));

//Second Method
var makeAdder2 = function(x) {
    return function add(y) {
        return x+y;
    }
}



var oneAdder2 = makeAdder2(2);
console.log(oneAdder2(4));
