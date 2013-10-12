package week2

object func {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  /*def sumInts(a: Int, b: Int): Int =
    if (a > b) 0
    else a + sumInts(a + 1, b)*/

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)                  //> sum: (f: Int => Int, a: Int, b: Int)Int

  def id(x: Int) = x                              //> id: (x: Int)Int
  def cube(x: Int) = x * x * x                    //> cube: (x: Int)Int
  def fact(x: Int): Int = if (x == 0) 1 else x * fact(x - 1)
                                                  //> fact: (x: Int)Int
  def sumInts(a: Int, b: Int) = sum(x => x, a, b) //> sumInts: (a: Int, b: Int)Int
  def sumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b)
                                                  //> sumCubes: (a: Int, b: Int)Int
  def sumFactorials(a: Int, b: Int) = sum(fact, a, b)
                                                  //> sumFactorials: (a: Int, b: Int)Int

  sumInts(1, 100)                                 //> res0: Int = 5050
  sumCubes(1, 100)                                //> res1: Int = 25502500
  sumFactorials(1, 5)                             //> res2: Int = 153

  (x: Int) => x * x * x                           //> res3: Int => Int = <function1>

  

}