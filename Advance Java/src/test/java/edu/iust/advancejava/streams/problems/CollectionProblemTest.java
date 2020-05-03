package edu.iust.advancejava.streams.problems;

import org.junit.jupiter.api.Test;
import static edu.iust.advancejava.streams.problems.CollectionProblem.*;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
    void testFrequencies() {
        Stream<Integer> data = Stream.of(1, 1, 2, 2, 2, 4, 5, 5, 5, 9, 9, 10).parallel();
        Map<Integer,Integer> expected = new HashMap<>();
        expected.put(1, 2);
        expected.put(2, 3);
        expected.put(4, 1);
        expected.put(5, 3);
        expected.put(9, 2);
        expected.put(10, 1);

        assertEquals(
                expected,
                data.collect(frequencies())
        );


        // count the frequency of characters in a string
        String message = "Java 8 ExAmpLe to execuTe StreaMs in pArallel";

        Map<Character, Integer> expectedCharFrequency= new HashMap<>();
        expectedCharFrequency.put('j', 1);
        expectedCharFrequency.put('a', 6);
        expectedCharFrequency.put('v', 1);
        expectedCharFrequency.put('8', 1);
        expectedCharFrequency.put('e', 7);
        expectedCharFrequency.put('x', 2);
        expectedCharFrequency.put('m', 2);
        expectedCharFrequency.put('p', 2);
        expectedCharFrequency.put('l', 4);
        expectedCharFrequency.put('t', 3);
        expectedCharFrequency.put('o', 1);
        expectedCharFrequency.put('c', 1);
        expectedCharFrequency.put('u', 1);
        expectedCharFrequency.put('s', 2);
        expectedCharFrequency.put('r', 2);
        expectedCharFrequency.put('i', 1);
        expectedCharFrequency.put('n', 1);
        expectedCharFrequency.put(' ', 7);

        // First thing first, convert string into stream of characters
        // use .chars() to get an instance of IntStream(integer representation of the characters) from the input String.
        // and then convert it to Stream char via .mapToObj()

        Stream<Character> characterStream = message.toLowerCase().chars().mapToObj(c-> (char) c).parallel();

        assertEquals(
                expectedCharFrequency,
                characterStream.collect(frequencies()));

        assertTrue(characterStream.isParallel());



        Stream<String> dayWiseWeatherReportStream = Stream.of(
                "Sunny", "Rainy", "Cloudy", "Sunny", "Rainy", "Sunny", "Sunny", "Cloudy", "Rainy", "Sunny",
                "Sunny", "Rainy", "Cloudy", "Sunny", "Rainy", "Cloudy", "Rainy", "Sunny", "Sunny", "Rainy",
                "Sunny", "Sunny", "Rainy", "Sunny", "Sunny", "Sunny", "Sunny", "Sunny", "Windy", "Windy",
                "Rainy").parallel();

        Map<String, Integer> expectedMonthlyFrequencyReport = new HashMap<>();
        expectedMonthlyFrequencyReport.put("Sunny", 16);
        expectedMonthlyFrequencyReport.put("Rainy", 9);
        expectedMonthlyFrequencyReport.put("Cloudy", 4);
        expectedMonthlyFrequencyReport.put("Windy", 2);

        assertEquals(
                expectedMonthlyFrequencyReport,
                dayWiseWeatherReportStream.collect(frequencies())
        );

        assertTrue(dayWiseWeatherReportStream.isParallel());

        // stream in parallel mode can be converted back to the sequential mode by using the sequential() method
        assertFalse(dayWiseWeatherReportStream.sequential().isParallel());
    }


    @Test
    void testGroupBy() {
        Stream<String> stream = Stream.of("Basit", "Ziya", "Sana", "Zakir", "Iqra", "Mudasir", "Shakoor", "Nuzhat");
        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(4, Arrays.asList("Ziya", "Sana", "Iqra"));
        expected.put(5, Arrays.asList("Basit", "Zakir"));
        expected.put(6, Arrays.asList("Nuzhat"));
        expected.put(7, Arrays.asList("Mudasir", "Shakoor"));

        assertEquals(
                expected,
                stream.collect(groupBy(String::length))
        );


    }
}