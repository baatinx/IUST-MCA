package edu.iust.advancejava.java8newfeatures.streamAPI;
import static edu.iust.advancejava.java8newfeatures.streamAPI.InfiniteStreams.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class InfiniteStreamsTest {

    @Test
    void testIterate() {
        assertEquals(
                Arrays.asList(1, 2, 3, 4, 5),
                iterate(1).limit(5).collect(Collectors.toList())
                );
    }
}