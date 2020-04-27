package edu.iust.advancejava.streams.problems;
import  static edu.iust.advancejava.streams.problems.SimpleCollectorProblems.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCollectorProblemsTest {
    public Stream<Salary> sampleSalaries(){
        return Arrays.stream(new Salary[]{
                new Salary(100.0, Optional.empty()),
                new Salary(500.0, Optional.of(200.0)),
                new Salary(700.0, Optional.of(400.0)),
                new Salary(800.0, Optional.ofNullable(null))
        });
    }

    @Test
    void testCalculateGrossSalaries() {
        assertArrayEquals(
                new Double[] {100.0, 700.0, 1100.0, 800.0},
                calculateGrossSalaries(sampleSalaries()).collect(Collectors.toList()).toArray()
        );
    }

    @Test
    void testCalculateAverageSalary() {
        assertEquals(
                675,
                calculateAverageSalary(sampleSalaries()), 0.01);
    }

    @Test
    void testCalculateAggregateSalary() {
        assertEquals(
                2700,
                calculateAggregateSalary(sampleSalaries())
        );
    }
}