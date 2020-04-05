var a = 5;

(function () {
    var a = 555;
    console.log(a);
    console.log("hello world");
})();


/*
Self-invoked functions are a mechanism by which you declare and call an anonymous function where your only goal 
is defining a new scope:

These functions are very useful when you want to declare private variables that shouldn’t be exposed to another
piece of code.
*/