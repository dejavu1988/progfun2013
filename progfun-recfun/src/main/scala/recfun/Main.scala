package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = 
    if (c == 0 ) 1
    else if (c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
      def check(c: Int, s: List[Char]): Boolean = 
        if (c < 0) false
        else if (s.isEmpty && c == 0) true
        else if (s.isEmpty && c > 0) false
        else if (s.head == ')') check(c - 1, s.tail)
        else if (s.head == '(') check(c + 1, s.tail)
        else check(c, s.tail)
          
      check(0, chars)
    }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = 
    if (money == 0) 1
    else if (coins.isEmpty) 0
    else if (money < coins.head) countChange(money, coins.tail)
    else countChange(money, coins.tail) + countChange(money - coins.head, coins)
  
}