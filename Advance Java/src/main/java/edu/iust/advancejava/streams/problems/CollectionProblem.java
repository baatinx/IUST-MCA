package edu.iust.advancejava.streams.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;

public class CollectionProblem {
    // public interface Collector<T, A, R>{
    //    Supplier<A> supplier();
    //    BiConsumer<A, T> accumulator();
    //    Function<A, R> finisher();
    //    BinaryOperator<A> combiner();
    //    Set<Characteristics> characteristics();
    //    }

    // T is the type of items in the stream to be collected
    // A is the type of the accumulator
    // R is the type of the result returned by the collector

    public static <T> Collector<T, Map<T, Integer>, Map<T, Integer>> frequencies(){
        return Collector.of(
                // supplier - container
                HashMap::new,

                // accumulator
                (acc, x)-> {
                    acc.merge(x, (acc.getOrDefault(x,0)) + 1, (v1, v2)-> v2);

                    // int count  = acc.getOrDefault(x, 0);
                    //acc.put(x, count +1);
                },
                //combiner
                (s1, s2)-> {
                    s2.forEach((key, value) -> s1.merge(key, value, (v1, v2)-> v1 + v2) );
                    return s1;
                }

                // how to implement finisher(), Characteristics here

        );
    }
/*
how to do simple reduce sum operation via Collector - pending
    public static Collector<Integer, Integer, Integer> collectorAsReducer(){
        return Collector.of(
                Integer::new,
                (acc, val)-> acc = acc + val,
                (x, y)-> x + y
        );
    }
*/
}
