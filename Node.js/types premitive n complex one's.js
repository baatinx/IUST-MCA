// primitives
var a = 5;
var b = a;
b = 6;
console.log(a); // will be 5
console.log(b); // will be 6
// complex
var arr = ['hello', 'world'];
var brr = arr;
brr[0] = 'bye';
console.log(arr[0]); // will be ’bye’
console.log(brr[0]); // will be ‘bye’

/*
You can divide JavaScript types into two groups: primitive and complex. When one of the
primitive types is accessed, you work directly on its value. When a complex type is accessed,
you work on a reference to the value.
    ***********************  The primitive types are number, boolean, string, null, and undefined.
    ***********************  The complex types are array, function, and object.
In the second example, b contains the same reference to the value as a does. Hence, when you
access the first member of the array, you alter the original, so a[0] === b[0].
*/