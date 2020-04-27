package edu.iust.advancejava.java8newfeatures.optionalclass;

import java.util.Optional;

public class OptionalDemo {
    // Java SE 8 introduces a new class called java.util.Optional<T> that is inspired from the ideas of Haskell and Scala.
    // You can view Optional as a single-value container that either contains a value or doesn't (it is then said to be "empty")
    // No more too many null checks and NullPointerException
    //  Like Collections and arrays, it is also a Container to hold at most one value.

    public static  String concat(String firstName, String lastName){
        Optional<String> fnNullCheck = Optional.ofNullable(firstName);
        // By doing this,  if we pass in a null reference, it doesn't throw an exception but rather
        // returns an empty Optional object, that we can validate later

        Optional<String> lnNullCheck = Optional.ofNullable(lastName);

        // isPresent() -  method returns true if the wrapped value is not null.
        if(fnNullCheck.isPresent() && lnNullCheck.isPresent())
            return  firstName + " " + lastName;

        return null;

    }
}
