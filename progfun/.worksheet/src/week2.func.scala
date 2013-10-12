package week2

object func {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  println("Welcome to the Scala worksheet");$skip(189); 

  /*def sumInts(a: Int, b: Int): Int =
    if (a > b) 0
    else a + sumInts(a + 1, b)*/

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b);System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(22); 

  def id(x: Int) = x;System.out.println("""id: (x: Int)Int""");$skip(31); 
  def cube(x: Int) = x * x * x;System.out.println("""cube: (x: Int)Int""");$skip(61); 
  def fact(x: Int): Int = if (x == 0) 1 else x * fact(x - 1);System.out.println("""fact: (x: Int)Int""");$skip(50); 
  def sumInts(a: Int, b: Int) = sum(x => x, a, b);System.out.println("""sumInts: (a: Int, b: Int)Int""");$skip(59); 
  def sumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b);System.out.println("""sumCubes: (a: Int, b: Int)Int""");$skip(54); 
  def sumFactorials(a: Int, b: Int) = sum(fact, a, b);System.out.println("""sumFactorials: (a: Int, b: Int)Int""");$skip(19); val res$0 = 

  sumInts(1, 100);System.out.println("""res0: Int = """ + $show(res$0));$skip(19); val res$1 = 
  sumCubes(1, 100);System.out.println("""res1: Int = """ + $show(res$1));$skip(22); val res$2 = 
  sumFactorials(1, 5);System.out.println("""res2: Int = """ + $show(res$2));$skip(25); val res$3 = 

  (x: Int) => x * x * x;System.out.println("""res3: Int => Int = """ + $show(res$3))}

  

}
