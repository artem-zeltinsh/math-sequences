package org.lotus.edu.math;

import org.junit.Test;
import org.junit.experimental.theories.*;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.collection.IsEmptyCollection.empty;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Theories.class)
public class SequenceTest {

    @Theory
    public void primeNumberShouldPassPrimalityTest(
            @TestedOn(ints = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31}) int prime) {
        assertTrue(prime + " should pass primality test", Sequence.Number.isPrime(prime));
    }

    @Theory
    public void compositeNumberShouldFailPrimalityTest(
            @TestedOn(ints = {4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25, 26, 27, 28, 30}) int composite) {
        assertFalse(composite + " should fail primality test", Sequence.Number.isPrime(composite));
    }

    @Theory
    public void negativeNumberOrZeroOrOneShouldFailPrimalityTest(
            @TestedOn(ints = {-3, -2, -1, 0, 1}) int negativeOrZeroOrOne) {
        assertFalse(negativeOrZeroOrOne + " should fail primality test", Sequence.Number.isPrime(negativeOrZeroOrOne));
    }

    @Test
    public void sequenceOfPrimes() {
        assertThat(Sequence.ofPrimes().limit(9).boxed().collect(toList()),
                contains(2, 3, 5, 7, 11, 13, 17, 19, 23));
    }

    @Test
    public void sequenceOfFibonacciNumbers() {
        assertThat(Sequence.ofFibonacciNumbers().limit(10).boxed().collect(toList()),
                contains(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));
    }
}