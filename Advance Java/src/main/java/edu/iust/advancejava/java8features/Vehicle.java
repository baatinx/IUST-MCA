package edu.iust.advancejava.java8features;

public interface Vehicle {
    // this is not functional interface

    //Abstract Methods
    String changeGear();
    String speedUp();

    // Extension Method
    default String applyBreaks(){
        return "Brakes Applied";
    }

    // then what will remain the difference between "Abstract Classes" & "Java 8 Interfaces with Extension Methods"

    // we used to say,
    // use Interface when we know implementation only
    // use Abstract Classes when we know partial implementation

    // pending - ????
}
