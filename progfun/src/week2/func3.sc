package week2

object func3 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  /*def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0
      else f(a) + sumF(a + 1, b)

    sumF
  }
*/
  def sum(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b)     //> sum: (f: Int => Int)(a: Int, b: Int)Int

  sum(x => x * x)(1, 2)                           //> res0: Int = 5

  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1 else f(a) * product(f)(a + 1, b) //> product: (f: Int => Int)(a: Int, b: Int)Int

  product(x => x * x)(1, 8)                       //> res1: Int = 1625702400

  def fact(n: Int): Int = product(x => x)(1, n)   //> fact: (n: Int)Int

  fact(10)                                        //> res2: Int = 3628800

  def mapReduce(f: Int => Int)(g: (Int, Int) => Int, meta:Int)(a: Int, b: Int): Int =
    if (a > b) meta
    else g(f(a), mapReduce(f)(g, meta)(a + 1, b)) //> mapReduce: (f: Int => Int)(g: (Int, Int) => Int, meta: Int)(a: Int, b: Int)I
                                                  //| nt

  def prod(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f)((x, y) => x * y, 1)(a,b)
                                                  //> prod: (f: Int => Int)(a: Int, b: Int)Int
  prod(x => x * x)(1, 8)                          //> res3: Int = 1625702400
}