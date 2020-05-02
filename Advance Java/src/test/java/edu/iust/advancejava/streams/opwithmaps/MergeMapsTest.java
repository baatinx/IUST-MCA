package edu.iust.advancejava.streams.opwithmaps;

import org.junit.jupiter.api.Test;
import  static edu.iust.advancejava.streams.opwithmaps.MergeMaps.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class MergeMapsTest {


    @Test
    void testCalculateTotalMarks() {
        HashMap<String, Integer> minors = new HashMap<>();
        HashMap<String, Integer> majors = new HashMap<>();

        minors.put("Core Java", 50);
        minors.put("Dot Net", 20);

        majors.put("Core Java", 35);
        majors.put("Dot Net", 40);
        majors.put("HTML", 10);

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Core Java", 85);
        expected.put("Dot Net", 60);
        expected.put("HTML", 10);

        assertEquals(
                expected,
                calculateTotalMarks(minors, majors)
        );

        // ????
        System.out.println(minors);
        System.out.println(majors);
        System.out.println(expected);
        // How ???? - are we doing call by reference

        /*{Core Java=85, Dot Net=60, HTML=10}
        {Core Java=35, Dot Net=40, HTML=10}
        {Core Java=85, Dot Net=60, HTML=10}*/

    }

    @Test
    void testFrequiencies() {
        List<Integer> data = Arrays.asList(1, 1, 1, 2, 2, 3, 4, 4, 5, 5, 5, 5, 5, 9);

        HashMap<Integer, Integer> expected = new HashMap<>();
        expected.put(1, 3);
        expected.put(2, 2);
        expected.put(3, 1);
        expected.put(4, 2);
        expected.put(5, 5);
        expected.put(9, 1);

        assertEquals(
                expected,
                frequiencies(data));
    }
}