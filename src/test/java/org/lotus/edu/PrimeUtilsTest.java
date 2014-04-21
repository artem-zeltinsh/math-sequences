package org.lotus.edu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import java.util.List;

@RunWith(JUnit4.class)
public class PrimeUtilsTest {

    @Test
    public void getPrimes() {
        assertPrimes(1);
        assertPrimes(2, 2);
        assertPrimes(3, 2, 3);
        assertPrimes(4, 2, 3);
        assertPrimes(5, 2, 3, 5);
        assertPrimes(6, 2, 3, 5);
        assertPrimes(7, 2, 3, 5, 7);
        assertPrimes(8, 2, 3, 5, 7);
        assertPrimes(9, 2, 3, 5, 7);
        assertPrimes(10, 2, 3, 5, 7);
        assertPrimes(11, 2, 3, 5, 7, 11);
        assertPrimes(12, 2, 3, 5, 7, 11);
    }

    private void assertPrimes(int number, int... expectedPrimes) {

        List<Integer> actualPrimes = PrimeUtils.getPrimes(number);
        assertEquals(actualPrimes.size(), expectedPrimes.length);

        for (int i = 0; i < expectedPrimes.length; i++) {
            assertEquals(expectedPrimes[i], (int) actualPrimes.get(i));
        }
    }
}

