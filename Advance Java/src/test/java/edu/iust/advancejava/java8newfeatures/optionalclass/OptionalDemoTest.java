package edu.iust.advancejava.java8newfeatures.optionalclass;
import org.junit.jupiter.api.Test;
import static  edu.iust.advancejava.java8newfeatures.optionalclass.OptionalDemo.*;
import static org.junit.jupiter.api.Assertions.*;

class OptionalDemoTest {

    @Test
    void testConcat() {
        assertEquals(
                "Mustafa Basit",
                concat("Mustafa","Basit"));

        assertEquals(
                null,
                concat("Mustafa" , null));

        String[] name = new String[2];
        name[0] = "Mustafa";

        assertNull(concat(name[0],name[1]));

    }
}