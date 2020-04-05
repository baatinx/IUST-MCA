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

//console.log(add(3, 5));


// if we will export one by one, the last exported thing will be avaliable on the other side
module.exports = add;
module.exports = PI;
module.exports = div;



