package org.lotus.edu.math;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class FibonacciUtilsTest {

    @Test(dataProvider = "expectedFibonacciNumbers")
    public void testF(int index, Integer[] expectedNumbers) {
        assertEquals(FibonacciUtils.f(index), Arrays.asList(expectedNumbers));
    }

    @DataProvider
    public static Object[][] expectedFibonacciNumbers() {
        return new Object[][]{
                {0, new Integer[]{0}},
                {1, new Integer[]{0, 1}},
                {2, new Integer[]{0, 1, 1}},
                {3, new Integer[]{0, 1, 1, 2}},
                {4, new Integer[]{0, 1, 1, 2, 3}},
                {5, new Integer[]{0, 1, 1, 2, 3, 5}},
                {6, new Integer[]{0, 1, 1, 2, 3, 5, 8}},
                {7, new Integer[]{0, 1, 1, 2, 3, 5, 8, 13}},
                {8, new Integer[]{0, 1, 1, 2, 3, 5, 8, 13, 21}}
        };
    }
}
