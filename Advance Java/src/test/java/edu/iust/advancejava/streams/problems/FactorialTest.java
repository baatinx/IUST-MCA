package edu.iust.advancejava.streams.problems;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testStream() {
        assertEquals(
                Arrays.asList(1L, 2L, 6L, 24L),
                Factorial.stream().limit(4).collect(Collectors.toList())

        );
    }
}