package org.lotus.edu.scala.math

/**
 * Singleton object to deal with some famous sequences.
 */
object Sequence {

  /**
   * Returns stream of primes.
   * @return stream of primes
   */
  def ofPrimes(): Stream[Int] = {
    def sieve(s: Stream[Int]): Stream[Int] = s.head #:: sieve(s.tail filter (_ % s.head != 0))
    sieve(Stream.from(2))
  }

  /**
   * Returns stream of Fibonacci numbers.
   * @return stream of fibonacci numbers
   */
  def ofFibonacciNumbers(): Stream[Int] = {
    def appendTail(f1: Int, f2: Int): Stream[Int] = f1 #:: appendTail(f2, f1 + f2)
    appendTail(0, 1)
  }

  object Number {

    /**
     * Tests if provided number is prime,
     * @param number number to test
     * @return true if the number is prime, false otherwise
     */
    def isPrime(number: Int): Boolean = {
      if (number <= 1) false
      else (2 to math.sqrt(number).toInt) forall(i => number % i != 0)
    }
  }
}