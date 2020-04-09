package edu.iust.advancejava.streams.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SequenceAggregator {
    public static int sum(Collection<Integer> list) {
        int result = 0;
        for (int item : list)
            result += item;
        return result;
    }

    public static int product(Collection<Integer> list) {
        int result = 1;
        for (int item : list)
            result *= item;
        return result;
    }


    public static<T> T simpleReduce(T initValue , SimpleAggregator<T> aggregator, Collection<T> list){
        T result = initValue;
        for(T item : list)
            result = aggregator.op(result, item);

        return  result;
    }

    public static <U, T> U reduce(U initValue, Aggregator<U,T> aggregator, Collection<T> list){

        U result = initValue;

        for(T item : list)
            result = aggregator.op(result, item);

        return result;
    }

    public static <U,T> Collection<U> map(Collection<T> list, Mapper<U,T> mapper){
        Collection<U> output = new ArrayList<>();

        for(T item : list)
            output.add(mapper.map(item));
        return output;
    }

    public static <T> Collection<T> filter(Collection<T> list, Predicate<T> predicate){
        Collection<T> output = new ArrayList<>();

        for(T item : list)
            if(predicate.test(item))
                output.add(item);
        return output;
    }


}