package org.lotus.edu;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;

/**
 * Utility class to deal with prime numbers.
 */
public class PrimeUtils {

    private PrimeUtils() {
    }

    /**
     * Returns the list of primes less or equal to the provided <code>boundary</code>.
     *
     * @param boundary - test boundary
     * @return list of primes
     */
    public static List<Integer> getPrimes(int boundary) {
        if (boundary <= 1) {
            return emptyList();
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= boundary; i++) {
            if (isPrime(i)) {
                result.add(i);
            }
        }

        return result;
    }

    /**
     * Tests if provided <code>number</code> is prime.
     *
     * @param number - a number to test
     * @return <code>true</code> if <code>number</code> is prime, <code>false</code> otherwise.
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        double testBoundary = Math.sqrt(number);
        for (int i = 2; i <= testBoundary; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
