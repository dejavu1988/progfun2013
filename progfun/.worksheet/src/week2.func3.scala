package week2

object func3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  println("Welcome to the Scala worksheet");$skip(250); 

  /*def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0
      else f(a) + sumF(a + 1, b)

    sumF
  }
*/
  def sum(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b);System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(25); val res$0 = 

  sum(x => x * x)(1, 2);System.out.println("""res0: Int = """ + $show(res$0));$skip(103); 

  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1 else f(a) * product(f)(a + 1, b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(29); val res$1 = 

  product(x => x * x)(1, 8);System.out.println("""res1: Int = """ + $show(res$1));$skip(49); 

  def fact(n: Int): Int = product(x => x)(1, n);System.out.println("""fact: (n: Int)Int""");$skip(12); val res$2 = 

  fact(10);System.out.println("""res2: Int = """ + $show(res$2));$skip(157); 

  def mapReduce(f: Int => Int)(g: (Int, Int) => Int, meta:Int)(a: Int, b: Int): Int =
    if (a > b) meta
    else g(f(a), mapReduce(f)(g, meta)(a + 1, b));System.out.println("""mapReduce: (f: Int => Int)(g: (Int, Int) => Int, meta: Int)(a: Int, b: Int)Int""");$skip(88); 

  def prod(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f)((x, y) => x * y, 1)(a,b);System.out.println("""prod: (f: Int => Int)(a: Int, b: Int)Int""");$skip(25); val res$3 = 
  prod(x => x * x)(1, 8);System.out.println("""res3: Int = """ + $show(res$3))}
}
