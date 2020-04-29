package edu.iust.advancejava.java8newfeatures.builtinfunctionalinterfaces;
import  static edu.iust.advancejava.java8newfeatures.builtinfunctionalinterfaces.FunctionDemo.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionDemoTest {

    @Test
    void testFunctionInterface() {
        assertEquals(
                20,
                functionInterface(2, x -> 10 * x));
    }
}