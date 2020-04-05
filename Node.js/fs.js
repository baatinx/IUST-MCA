var fs = require("fs");
fs.writeFileSync("./public/text/fs.txt", "hello world"); //create or write a file
console.log(fs.readFileSync("./public/text/fs.txt").toString()); //read a file