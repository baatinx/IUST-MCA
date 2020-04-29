package edu.iust.advancejava.streams.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;

public class CollectionProblem {
    public static <T> Collector<T, Map<T, Integer>, Map<T, Integer>>frequiencies(){
        return Collector.of(
                HashMap::new,
                (acc, x)-> {
                    int count  = acc.getOrDefault(x, 0);
                    acc.put(x, count +1);
                },
                (xs, ys)->{
                    xs.forEach((key, value) );
                }

        );
    }


}
