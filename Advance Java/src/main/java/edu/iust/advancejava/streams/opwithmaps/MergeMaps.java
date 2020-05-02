package edu.iust.advancejava.streams.opwithmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeMaps {

    public static Map<String, Integer> calculateTotalMarks(Map<String, Integer> minors, Map<String, Integer> majors){

        // The merge(Key, Value, BiFunctional) method of HashMap class is used to
        // combine multiple mapped values for a key using the given mapping function.
        // BiFunction - resolves conflict

        minors.forEach((minors_key, minors_value) -> majors.merge(minors_key, minors_value, (minor_val, major_val)-> minor_val + major_val));
        return majors;
    }

    public static Map<Integer, Integer> frequiencies(List<Integer> list){
        Map<Integer, Integer> freq = new HashMap<>();

        for(Integer item : list){
            int count = freq.getOrDefault(item, 0);
            count++;

            //freq.put(item, count);

            freq.merge(item, count, (v1, v2)-> v2);

            // map.merge
            // if next time the key and value is same as pervious, will it go to the resolver function to decide which value to choose?
            // no, it will not go to the resolver function, because both values are same
        }
        return  freq;
    }
}
