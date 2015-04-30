package org.lotus.edu.scala.math

/**
 * Singleton object to deal with some famous sequences.
 */
object Sequence {

  /**
   * Returns sequence of primes less or equal to the provided boundary.
   * @param boundary test boundary
   * @return sequence of primes
   */
  def getPrimes(boundary: Int): IndexedSeq[Int] = for (n <- 2 to boundary if Number.isPrime(n)) yield n

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