package edu.iust.advancejava.streams.opwithmaps;

import java.util.Map;

public class MergeMaps {

    public static Map<String, Integer> mapMergeViaMerge(Map<String, Integer> minors, Map<String, Integer> majors){

        // The merge(Key, Value, BiFunctional) method of HashMap class is used to
        // combine multiple mapped values for a key using the given mapping function.

        // BiFunction - resolves conflict

        minors.forEach((minors_key, minors_value) -> majors.merge(minors_key, minors_value, (minor_val, major_val)-> minor_val + major_val));
        return majors;
    }
}
