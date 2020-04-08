package edu.iust.advancejava.streams.lambda;
import static edu.iust.advancejava.streams.lambda.SequenceGenerator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceGeneratorTest {

    @Test
    void usingRange() {
        // constant step
        assertArrayEquals(
                range(1, 10, 2).toArray(),
                new Integer[] {1, 3, 5, 7, 9});
    }

    @Test
    void usingRangeWithStepLogic() {
        // constant step logic test
        assertArrayEquals(
                rangeWithStepLogic(1, 10, new StepLogic() {
                    @Override
                    public int increment(int i) {
                        return (i + 2);
                    }}).toArray(),
                new Integer[] {1, 3, 5, 7, 9}
        );

        // variable step logic test
        assertArrayEquals(
                rangeWithStepLogic(2, 10, new StepLogic() {
                    @Override
                    public int increment(int i) {
                        return (i * i);
                    }}).toArray(),
                new Integer[] {2, 4}
        );

        // same as above one, but done via lambda
        assertArrayEquals(
                rangeWithStepLogic(2, 10, (i) -> (i * i)).toArray(),
                new Integer[] {2, 4});
    }

}