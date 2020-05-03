package edu.iust.advancejava.java8newfeatures.builtinfunctionalinterfaces;

import java.util.function.Function;

public class FunctionDemo {
    // The Function interface represents a function (method) that takes a single parameter and returns a single value
    public  static  <T>  T functionInterface(T value , Function<T,T> function){

        return function.apply(value);
    }
    //http://tutorials.jenkov.com/java-functional-programming/functional-interfaces.html


    //https://www.geeksforgeeks.org/function-interface-in-java-with-examples/  - pending
}
