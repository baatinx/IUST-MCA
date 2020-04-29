package edu.iust.advancejava.streams.opwithmaps;

import org.junit.jupiter.api.Test;
import  static edu.iust.advancejava.streams.opwithmaps.MergeMaps.*;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;
class MergeMapsTest {


    @Test
    void testMapMergeViaMerge() {
        HashMap<String, Integer> minors = new HashMap<>();
        HashMap<String, Integer> majors = new HashMap<>();
        HashMap<String, Integer> totalMarks = new HashMap<>();

        minors.put("Core Java", 50);
        minors.put("Dot Net", 20);

        majors.put("Core Java", 35);
        majors.put("Dot Net", 40);
        majors.put("HTML", 10);

        totalMarks.put("Core Java", 85);
        totalMarks.put("Dot Net", 60);
        totalMarks.put("HTML", 10);

        assertEquals(
                totalMarks,
                mapMergeViaMerge(minors, majors)
        );

        // ????
        System.out.println(minors);
        System.out.println(majors);
        System.out.println(totalMarks);
        // How ???? - are we doing call by reference
        /*{Core Java=85, Dot Net=60, HTML=10}
        {Core Java=35, Dot Net=40, HTML=10}
        {Core Java=85, Dot Net=60, HTML=10}*/

    }
}