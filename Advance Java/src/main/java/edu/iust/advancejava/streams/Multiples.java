package edu.iust.advancejava.streams;

import java.util.stream.Stream;

public class Multiples {
    public static Stream<Integer> multiplesOf5(Stream<Integer> values){
        return values.filter(x -> x % 5 == 0);
    }

    public static Stream<Integer> multiplesOfN(Stream<Integer> values, int n){
        return values.filter(x-> x % n == 0);
    }
    public static int sumOfMultiplesOfN(Stream<Integer> values, int n){
        return values.filter(x-> x % n == 0).reduce(0, (result, x)-> result + x );
    }


}
