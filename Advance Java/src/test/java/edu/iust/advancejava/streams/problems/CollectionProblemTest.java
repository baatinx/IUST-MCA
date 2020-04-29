package edu.iust.advancejava.streams.problems;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollectionProblemTest {
    @Test
    public void testMapMerge(){
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "one");
        m.put(2, "two");
        m.merge(2, "twoo", (v1, v2)-> v1 + "/" + v2);
        assertEquals("two/twoo", m.get(2));

        m.merge(2, "ten", (v1, v2)->  v2);
        assertEquals("ten", m.get(2));

        m.put(3,null);
        assertNull(m.get(3));

        // ***
        // key already exits there
        // but value is null, so it will not go to the resolver function
        m.merge(3, "three", (v1, v2)->  v2 + "hello!");

        assertEquals("three",m.get(3));
    }

    @Test
    public void testMapMergeWithLists(){
        Map<Integer, List<String >> m = new HashMap<>();
        m.put(1, Collections.singletonList("one"));
        m.put(2, Collections.singletonList("two"));
        m.merge(2, Collections.singletonList("twoo"), (l1, l2)-> {
            List<String>  z  = new ArrayList<>();
            z.addAll(l1);
            z.addAll(l2);
            return z;
        });

        assertEquals(Arrays.asList("two", "twoo"), m.get(2));

        m.put(3, Arrays.asList("laptop", "mouse"));
        assertEquals(Arrays.asList("laptop", "mouse"), m.get(3));


        m.merge(3, Arrays.asList("pendrive", "mouse", "speakers"), (l1, l2) -> l2 );
        assertEquals(Arrays.asList("pendrive", "mouse", "speakers"), m.get(3));
    }

    @Test


}