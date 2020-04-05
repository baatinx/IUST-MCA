var math = require('./math.js');

console.log( math.add( 2, 5 ) )

console.log( math.mul( math.PI, 2 ) );


// below method and a variable is added to module.exports object directly

math.anotherMethod();
console.log(math.DELTA);