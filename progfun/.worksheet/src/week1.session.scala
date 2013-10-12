package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 

  def abs(x: Double): Double = if (x >= 0) x else -x;System.out.println("""abs: (x: Double)Double""");$skip(427); 

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

  };System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$0 = 

  sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(92); 
  
  def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b);System.out.println("""gcd: (a: Int, b: Int)Int""");$skip(16); val res$1 =    //tail-recursion
  
  gcd(96,15);System.out.println("""res1: Int = """ + $show(res$1))}

  /*def factorial(n: Int): Int =
    if (n == 0) 1 else n * factorial(n - 1)   //not tail*/
    
}
