    // this program will demonstrate how to declare and use 
        // 1. function statement 
        // 2. anonymous function
        // 3. function expression


//1. normal function Statement

function sayHi (msg){
    console.log(`Function Statement : ${msg}`);   
}

var msg = 'hi';

sayHi(msg);


// 2. anonymous function
// anonymous function is a function without name of it 

setTimeout(function(){
    console.log('hi from anonmous function');

},1000)


// 3. function expression

var saybye = function(msg){
    console.log(`Function Expression : ${msg}`);
};

msg = "bye";

saybye(msg);

// we can even pass function to a function as a parameter, like we pass variables 
// those functions are called "higher order functions"

// normal function to print something

function print(){
    console.log('hello from print()');
}

// now we will pass this function to another function as argument

// in the below line we as just accepting a function in a func,  

function anotherFunction(func){  
    func(); 
    
}


anotherFunction(print);
