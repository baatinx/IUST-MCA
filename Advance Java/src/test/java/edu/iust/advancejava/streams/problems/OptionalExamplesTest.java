package edu.iust.advancejava.streams.problems;

import static edu.iust.advancejava.streams.problems.OptionalExamples.*;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class OptionalExamplesTest {

    @Test
    void testMax() {
        assertTrue(OptionalExamples.max(3, 5).isPresent());
        assertTrue(OptionalExamples.max(0, 0).isPresent());
        assertEquals(
                Optional.ofNullable(null),
                Optional.empty()
        );
        assertEquals(
                Optional.ofNullable(5),
                5
        );
    }

    public static Boolean odd(Integer x){
        //return (x % 2 == 0) ? false : true;
        return x % 2 != 0;
    }
    @Test
    void testFindInEither() {
        assertTrue(OptionalExamples.findInEither(Stream.of(1, 2, 3), Stream.of(5, 6, 7), OptionalExamplesTest::odd).isPresent());
        assertFalse(OptionalExamples.findInEither(Stream.of(2, 4), Stream.of(6, 8), OptionalExamplesTest::odd).isPresent());
        assertTrue(OptionalExamples.findInEither(Stream.of(2, 2), Stream.of(4, 8), OptionalExamplesTest::odd).isEmpty());
        Optional<Integer> match = OptionalExamples.findInEither(Stream.of(2, 8, 6), Stream.of(2, 4, 5, 3, 7, 2), OptionalExamplesTest::odd);

        assertEquals(
                match.get(),
                new Integer(5)
        );

        assertEquals(
                OptionalExamples.findInEither(Stream.of(2, 8, 6), Stream.of(2, 4), OptionalExamplesTest::odd),
                Optional.empty());

    }
}