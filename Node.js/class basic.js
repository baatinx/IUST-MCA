function Animal(name) {
    this.name = name;
}

Animal.prototype.getName = function () {
    return this.name;
};

var animal = new Animal('loin');
console.log(animal.getName());

/*
In JavaScript, there’s no class keyword. A class is defined like a function instead:
        function Animal () { }

To define a method on all the instances of Animal that you create, you set it on the
prototype:

It’s worth mentioning that within functions in the prototype, this doesn’t refer to the global
object like regular functions, but to the class instance instead:

*/