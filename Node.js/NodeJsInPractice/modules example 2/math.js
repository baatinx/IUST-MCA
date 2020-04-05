//below line will execute , when some file will export this file;
console.log('hello world');

var PI = 3.14;

function add(a ,b){
    return a + b;
}

function sub(a ,b){
    return a - b;
}

var mul = function (a ,b){
    return a * b;
}


var div = function (a ,b){
    return a / b;
}


//add(3, 5);   //******************* what happens here to return type , google it 





//module.export  is basically an empty object, 
// we can add to it various methods and variable 
/*
module.exports.PI = PI;
module.exports.add = add;
module.exports.sub = sub;
module.exports.mul = mul;
module.exports.div = div;
*/

// or we can add using object literal

module.exports = {
    PI : PI,
    add : add,
    sub : sub,
    mul : mul,
    div : div
}

// another way  to add methods and variables to module.exports
module.exports.anotherMethod = function(){
    console.log("another method");
}

module.exports.DELTA = 300;


