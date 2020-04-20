package edu.iust.advancejava.java8features;
import edu.iust.advancejava.java8features.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtensionMethodsTest {

    @Test
    void testApplyBreaks() {
        assertEquals(
                new String("Brakes Applied"),
                new ExtensionMethods().applyBreaks()
        );
    }



    @Test
    void testChangeGear() {
        assertEquals(
                new String("Gear Changed"),
                new ExtensionMethods().changeGear()
        );
    }

    @Test
    void testSpeedUp() {
        assertEquals(
                new String("Speed Increased"),
                new ExtensionMethods().speedUp()
        );
    }

}