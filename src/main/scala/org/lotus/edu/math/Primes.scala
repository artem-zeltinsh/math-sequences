package org.lotus.edu.math

/**
 * Singleton object to deal with prime numbers.
 */
object Primes {

  /**
   * Returns sequence of primes less or equal to the provided boundary.
   * @param boundary test boundary
   * @return sequence of primes
   */
  def getPrimes(boundary: Int): IndexedSeq[Int] = 2.to(boundary).filter(n => isPrime(n))

  /**
   * Tests if provided number is prime,
   * @param number number to test
   * @return true if the number is prime, false otherwise
   */
  def isPrime(number: Int): Boolean = {
    if (number <= 1) false
    else (2 to math.sqrt(number).toInt).forall(i => number % i != 0)
  }
}