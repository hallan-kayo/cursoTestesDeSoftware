package com.project.simplemath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.project.simpleMath.SimpleMath;

public class SimpleMathTest {

    SimpleMath math = new SimpleMath();

    @Test
    void testSum() {
        Double actual = math.sum(6.2D, 2D);
        Double expected = 8.2D;

        Assertions.assertEquals(expected, actual, () -> "The TestSum did not produce expect result");

        Assertions.assertNotNull(actual);

        Assertions.assertNotEquals(12.4, actual);
    }

    @Test
    void testSubtraction() {
        Double actual = math.subtraction(6.2D, 2D);

        Double expected = 4.2D;

        Assertions.assertEquals(expected, actual, () -> "The subtraction did not produce expected result");

        Assertions.assertNotEquals(0, actual);

        Assertions.assertNotNull(actual);
    }

    @Test
    void testMultiplication() {
        Double actual = math.multiplication(6.2D, 2D);

        Double expected = 12.4D;

        Assertions.assertEquals(expected, actual, () -> "The multiplication did not produce expected result");

        Assertions.assertNotEquals(4, actual);

        Assertions.assertNotNull(actual);
    }

    @Test
    void testDivision() {
        Double actual = math.division(6D, 2D);

        Double expected = 3D;

        Assertions.assertEquals(expected, actual, () -> "The division did not produce expected result");

        Assertions.assertNotEquals(2, actual);

        Assertions.assertNotNull(actual);
    }

    @Test
    void testMean() {
        Double actual = math.mean(6D, 2D);

        Double expected = 4D;

        Assertions.assertEquals(expected, actual, () -> "The mean did not produce expected result");

        Assertions.assertNotEquals(8, actual);

        Assertions.assertNotNull(actual);
    }

    @Test
    void testSquareRoot() {
        Double actual = math.squareRoot(25D);

        Double expected = 5D;

        Assertions.assertEquals(expected, actual, () -> "The squareRoot did not produce expected result");

        Assertions.assertNotEquals(6, actual);

        Assertions.assertNotNull(actual);
    }

}
