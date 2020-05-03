package edu.iust.advancejava.streams.problems;

import java.util.stream.Stream;

public class Fibonacci {
    public static Stream<Long> stream(){
        return Stream.iterate(new Pair<>(0L, 1L),
                pair-> new Pair<>(pair.getSecond(), pair.getFirst() + pair.getSecond())).map(Pair::getFirst);
    }
}
