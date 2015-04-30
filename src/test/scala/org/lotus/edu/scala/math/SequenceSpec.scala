package org.lotus.edu.scala.math

import org.scalatest.FlatSpec
import org.scalatest.prop.TableDrivenPropertyChecks

class SequenceSpec extends FlatSpec with TableDrivenPropertyChecks {

  val primes = Table("primes", 2, 3, 5, 7, 11, 13, 17, 19)
  "Primes" should "pass primality test" in {
    forAll(primes) { (n: Int) =>
      assert(Sequence.Number.isPrime(n))
    }
  }

  val composite = Table("composite", 4, 6, 8, 9, 10, 12, 14, 15)
  "Composite numbers" should "fail primality test" in {
    forAll(composite) { (n: Int) =>
      assert(!Sequence.Number.isPrime(n))
    }
  }

  val negativeZeroAndOne = Table("negativeZeroAndOne", -2, -1, 0, 1)
  "Negative numbers, 0 and 1" should "fail primality test" in {
    forAll(negativeZeroAndOne) { (n: Int) =>
      assert(!Sequence.Number.isPrime(n))
    }
  }

  "Stream of primes" should "provide only prime numbers" in {
    assert(Sequence.ofPrimes().take(8).toSeq === Seq(2, 3, 5, 7, 11, 13, 17, 19))
  }

  "Stream of fibonacci numbers" should "provide only fibonacci numbers" in {
    assert(Sequence.ofFibonacciNumbers().take(10).toSeq === Seq(0, 1, 1, 2, 3, 5, 8, 13, 21, 34))
  }
}