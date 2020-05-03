package edu.iust.advancejava.streams.problems;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testStream() {
        assertEquals(
                Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L, 8L),
                Fibonacci.stream().limit(7).collect(Collectors.toList()));
    }
}