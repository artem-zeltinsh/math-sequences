package org.lotus.edu.math;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;

public class PrimeUtilsTest {

    @Test(dataProvider = "expectedPrimes")
    public void getPrimes(int number, Integer[] expectedPrimes) {
        assertEquals(PrimeUtils.getPrimes(number), Arrays.asList(expectedPrimes));
    }

    @DataProvider(name = "expectedPrimes")
    public static Object[][] expectedPrimes() {
        return new Object[][]{
                {-1, new Integer[]{}},
                {0, new Integer[]{}},
                {1, new Integer[]{}},
                {2, new Integer[]{2}},
                {3, new Integer[]{2, 3}},
                {4, new Integer[]{2, 3}},
                {5, new Integer[]{2, 3, 5}},
                {6, new Integer[]{2, 3, 5}},
                {7, new Integer[]{2, 3, 5, 7}},
                {8, new Integer[]{2, 3, 5, 7}},
                {9, new Integer[]{2, 3, 5, 7}},
                {10, new Integer[]{2, 3, 5, 7}},
                {11, new Integer[]{2, 3, 5, 7, 11}},
                {12, new Integer[]{2, 3, 5, 7, 11}},
                {13, new Integer[]{2, 3, 5, 7, 11, 13}},
                {14, new Integer[]{2, 3, 5, 7, 11, 13}},
                {15, new Integer[]{2, 3, 5, 7, 11, 13}},
                {16, new Integer[]{2, 3, 5, 7, 11, 13}},
                {17, new Integer[]{2, 3, 5, 7, 11, 13, 17}},
                {18, new Integer[]{2, 3, 5, 7, 11, 13, 17}},
                {19, new Integer[]{2, 3, 5, 7, 11, 13, 17, 19}},
                {20, new Integer[]{2, 3, 5, 7, 11, 13, 17, 19}}
        };
    }

    @Test(dataProvider = "isPrimeNumber")
    public void testIsPrime(int number, boolean isPrimeExpected) {
        assertEquals(isPrimeExpected, PrimeUtils.isPrime(number));
    }

    @DataProvider(name = "isPrimeNumber")
    public static Object[][] isPrimeNumbers() {
        return new Object[][]{
                {-1, false},
                {0, false},
                {1, false},
                {2, true},
                {3, true},
                {4, false},
                {5, true},
                {6, false},
                {7, true},
                {8, false},
                {9, false},
                {10, false},
                {11, true},
                {12, false},
                {13, true},
                {14, false},
                {15, false},
                {16, false},
                {17, true},
                {18, false},
                {19, true},
                {20, false}
        };
    }
}

