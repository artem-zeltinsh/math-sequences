package org.lotus.edu.math;

import org.junit.Test;
import org.junit.experimental.theories.*;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.RunWith;

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
    public void getPrimes() {
        assertThat(Sequence.ofPrimes(-1), empty());
        assertThat(Sequence.ofPrimes(0), empty());
        assertThat(Sequence.ofPrimes(1), empty());
        assertThat(Sequence.ofPrimes(2), contains(2));
        assertThat(Sequence.ofPrimes(3), contains(2, 3));
        assertThat(Sequence.ofPrimes(4), contains(2, 3));
        assertThat(Sequence.ofPrimes(5), contains(2, 3, 5));
        assertThat(Sequence.ofPrimes(6), contains(2, 3, 5));
        assertThat(Sequence.ofPrimes(7), contains(2, 3, 5, 7));
        assertThat(Sequence.ofPrimes(8), contains(2, 3, 5, 7));
        assertThat(Sequence.ofPrimes(9), contains(2, 3, 5, 7));
        assertThat(Sequence.ofPrimes(10), contains(2, 3, 5, 7));
        assertThat(Sequence.ofPrimes(11), contains(2, 3, 5, 7, 11));
    }
}