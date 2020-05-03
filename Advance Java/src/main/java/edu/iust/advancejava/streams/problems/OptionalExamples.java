package edu.iust.advancejava.streams.problems;


import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class OptionalExamples {
    public static <T extends Comparable<T>> Optional<T> max(T x, T y){
        return (x == null | y == null) ? Optional.empty() : Optional.of(x.compareTo(y) > 0 ? x : y );
    }

    public static <T> Optional<T> find(Stream<T> stream, Predicate<T> predicate){
        return stream.filter(predicate).findFirst();
    }

    public static <T> Optional<T>  findInEither(Stream<T> s1, Stream<T> s2, Predicate<T> predicate){

        Optional<T> isFoundInFirstStream = find(s1, predicate);
        return isFoundInFirstStream.isPresent() ? isFoundInFirstStream : find(s2, predicate);
    }
}
