package week1

object session {

  def abs(x: Double): Double = if (x >= 0) x else -x
                                                  //> abs: (x: Double)Double

  def sqrt(x: Double): Double = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    def isGoodEnough(guess: Double): Boolean =
      abs(1 - (guess * guess) / x) <= 0.001

    def guess(x: Double): Double = if (x > 1) x / 2 else if (x == 1) 1 else x * 2

    sqrtIter(guess(x))

  }                                               //> sqrt: (x: Double)Double

  sqrt(2)                                         //> res0: Double = 1.4142156862745097
  
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)   //tail-recursion
                                                  //> gcd: (a: Int, b: Int)Int
  
  gcd(96,15)                                      //> res1: Int = 3

  /*def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1)   //not tail*/
    
}