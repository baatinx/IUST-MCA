package edu.iust.advancejava.java8newfeatures.streamAPI;

import java.util.function.Function;
import java.util.stream.Stream;

public class InfiniteStreams {
    public static Stream<Integer> iterate(Integer seed){
        Stream<Integer> infiniteStream = Stream.iterate(seed, x-> x + 1);
        return infiniteStream;
    }

    //The stream.iterate was enhanced in Java 9. It supports a predicate (condition) as second argument, and the stream.iterate will stop if the predicate is false.
	// Stream.iterate(1, n -> n < 20 , n -> n * 2)
       //     .forEach(x -> System.out.println(x));

}
