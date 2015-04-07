package org.lotus.edu.math;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * Utility class to deal with prime numbers.
 */
public class PrimeUtils {

    private PrimeUtils() {
    }

    /**
     * Returns the list of primes less or equal to the provided {@code boundary}.
     * @param boundary test boundary
     * @return list of primes
     */
    public static List<Integer> getPrimes(int boundary) {
        return IntStream.rangeClosed(2, boundary).filter(n -> isPrime(n)).boxed().collect(toList());
    }

    /**
     * Tests if provided <code>number</code> is prime.
     * @param number a number to test
     * @return {@code true} if the number is prime, {@code false} otherwise
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        double testBoundary = Math.sqrt(number);
        return IntStream.rangeClosed(2, (int) testBoundary).noneMatch(i -> number % i == 0);
    }
}
