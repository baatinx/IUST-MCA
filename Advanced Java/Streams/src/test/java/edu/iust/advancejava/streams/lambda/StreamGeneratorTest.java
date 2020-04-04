package edu.iust.advancejava.streams.lambda;

import org.junit.Test;

import static  edu.iust.advancejava.streams.lambda.StreamGenerator.*;
import static org.junit.Assert.*;

public class StreamGeneratorTest {
    @Test
    public void usingRange() {
        assertArrayEquals(  
                range(4, 41, 4).toArray(),
                new Integer[]{4, 8, 12, 16, 20, 24, 28, 32, 36, 40}
        );
    }

    @Test
    public void UsingRangeWithStepLogic() {
        assertArrayEquals(
                rangeWithStepLogic(2, 7000, new StepLogic() {
                    @Override
                    public int increment(int i) {
                        return i * i;
                    }
                }).toArray(),
                new Integer[]{2, 4, 16, 256});
    }

    @Test
    public void UsingGenericSeriesWithLogic() {
       assertArrayEquals(
               genericSeriesWithLogic(10, seed -> seed + seed > 100 ? null : seed + seed).toArray(),
               new Integer[]{10, 20, 40, 80});

    }
}