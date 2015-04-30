package org.lotus.edu.math;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * Utility class to deal with some famous sequences.
 */
public class Sequence {

    private Sequence() {
    }

    /**
     * Returns a list of primes less or equal to the provided {@code boundary}.
     * @param boundary test boundary
     * @return list of primes
     */
    public static List<Integer> ofPrimes(int boundary) {
        return IntStream.rangeClosed(2, boundary).filter(n -> Number.isPrime(n)).boxed().collect(toList());
    }

    public static class Number {
        /**
         * Tests if provided <code>number</code> is prime.
         * @param number a number to test
         * @return {@code true} if the number is prime, {@code false} otherwise
         */
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }

            double testBoundary = java.lang.Math.sqrt(number);
            return IntStream.rangeClosed(2, (int) testBoundary).noneMatch(i -> number % i == 0);
        }
    }
}
