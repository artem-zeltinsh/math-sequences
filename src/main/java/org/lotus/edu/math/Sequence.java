package org.lotus.edu.math;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Utility class to deal with some famous sequences.
 */
public class Sequence {

    private Sequence() {
    }

    /**
     * Returns stream of primes.
     * @return stream of primes
     */
    public static IntStream ofPrimes() {
        return IntStream.iterate(1, i -> i + 1).filter(Number::isPrime);
    }

    /**
     * Returns stream of Fibonacci numbers.
     * @return stream of Fibonacci numbers
     */
    public static IntStream ofFibonacciNumbers() {
        return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]}).mapToInt(t -> t[0]);
    }

    public static class Number {
        /**
         * Tests if provided {@code number} is prime.
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
}
