package edu.iust.advancejava.streams.problems;
import java.util.stream.Stream;


public class Factorial {
    public static Stream<Long> stream(){
        return  Stream.iterate(new Pair<>(1, 1L),
                pair-> new Pair<>(
                        pair.getFirst() + 1,
                        pair.getSecond() * ( pair.getFirst() + 1))
                        // *** Dynamic programming
        ).map(Pair::getSecond);
    }
}
