package org.lotus.edu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PrimeUtilsParametrizedTest
{
    private int number;
    private boolean isPrimeExpected;

    @Parameterized.Parameters(name = "is prime {0} = {1}")
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
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
                {14, false}
        };

        return Arrays.asList(data);
    }

    public PrimeUtilsParametrizedTest(int number, boolean isPrimeExpected) {
        this.number = number;
        this.isPrimeExpected = isPrimeExpected;
    }

    @Test
    public void test() {
        assertEquals(isPrimeExpected, PrimeUtils.isPrime(number));
    }
}
