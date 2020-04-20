package edu.iust.advancejava.streams;

import org.junit.jupiter.api.Test;

import static edu.iust.advancejava.streams.Multiples.*;
import static  java.util.stream.Collectors.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {
    @Test
    void testMultiplesOf5() {
        assertEquals(
                Stream.of(15, 30, 5).collect(toList()),
                multiplesOf5(Stream.of(1, 15, 22, 30, 1, 5)).collect(toList()));
    }

    @Test
    void testMultiplesOfN() {
        assertEquals(
                Stream.of(20, 2, 4, 6, 8).collect(toList()),
                multiplesOfN(Stream.of(20, 1, 2, 3, 4, 5, 6, 7, 8), 2).collect(toList())
        );
    }

    @Test
    void testSumOfMultiplesOfN() {
        assertEquals(
                Integer.valueOf(50),
                sumOfMultiplesOfN(Stream.of(3, 5, 30, 2, 10, 5), 5)
        );
    }
}