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

  "For a number we" should "find primes less or equal to that number" in {
    assert(Sequence.getPrimes(-1) == IndexedSeq())
    assert(Sequence.getPrimes(0) == IndexedSeq())
    assert(Sequence.getPrimes(1) == IndexedSeq())
    assert(Sequence.getPrimes(2) == IndexedSeq(2))
    assert(Sequence.getPrimes(3) == IndexedSeq(2, 3))
    assert(Sequence.getPrimes(4) == IndexedSeq(2, 3))
    assert(Sequence.getPrimes(5) == IndexedSeq(2, 3, 5))
    assert(Sequence.getPrimes(6) == IndexedSeq(2, 3, 5))
    assert(Sequence.getPrimes(7) == IndexedSeq(2, 3, 5, 7))
    assert(Sequence.getPrimes(8) == IndexedSeq(2, 3, 5, 7))
    assert(Sequence.getPrimes(9) == IndexedSeq(2, 3, 5, 7))
    assert(Sequence.getPrimes(10) == IndexedSeq(2, 3, 5, 7))
    assert(Sequence.getPrimes(11) == IndexedSeq(2, 3, 5, 7, 11))
  }
}