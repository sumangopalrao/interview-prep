//window setTimeout closure problem

function f() {
    for(var i=0; i<=5; i++) {
        setTimeout(function() {
            console.log(i);
        }, i*1000);
    }
}

f();



function g() {
    for(var i=0; i<=5; i++) {
        (function(j) {
            setTimeout(function() {
                console.log(j);
            }, j*1000);
        })(i);
    }
}

g();

function h() {
    for(let i=0; i<=5; i++) {
        setTimeout(function() {
            console.log(i);
        }, i*1000);
    }
}

h();
