package week3

object list {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	
	val list = new Cons(1, new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : week3.Cons[Int] = week3.Cons@31981115
  list.nth(2)                                     //> res0: Int = 3
}