package week2
import scala.math

object rational {
  val x = new Rational(1, 3)                      //> x  : week2.Rational = 1/3
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 3

  val y = new Rational(5, 7)                      //> y  : week2.Rational = 5/7
  x + y                                           //> res2: week2.Rational = 22/21

  val z = new Rational(3, 2)                      //> z  : week2.Rational = 3/2
  x - y - z                                       //> res3: week2.Rational = -79/42

  y + y                                           //> res4: week2.Rational = 10/7

  x < y                                           //> res5: Boolean = true
  x max y                                         //> res6: week2.Rational = 5/7
  /*val strange = new Rational(1, 0)
  strange.add(strange)*/
  -y                                              //> res7: week2.Rational = -5/7
  new Rational(2)                                 //> res8: week2.Rational = 2/1

  //assert(1 == 0, "ok")
}

class Rational(x: Int, y: Int) {
  require(y > 0, "denominator must be positive")

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a
    else gcd(b, a % b)
  val numer = x / math.abs(gcd(x, y))
  val denom = y / math.abs(gcd(x, y))

  //def numer = x
  //def denom = y

  def this(x: Int) = this(x, 1)

  def <(that: Rational): Boolean = numer * that.denom < that.numer * denom

  def max(that: Rational): Rational = if (this < that) that else this

  def +(that: Rational) = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
  }

  def -(that: Rational) = this + -that

  def unary_- : Rational = {
    new Rational(-numer, denom)
  }

  override def toString = numer + "/" + denom

}