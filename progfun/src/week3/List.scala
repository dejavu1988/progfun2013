package week3

trait List[T] {
	def isEmpty: Boolean
	def head: T
	def tail: List[T]
	def nth(n: Int): T = 
	  if(this.isEmpty) throw new IndexOutOfBoundsException
	  else if(n == 0) this.head
	  else this.tail.nth(n-1)
}

class Nil[T] extends List[T]{
  def isEmpty: Boolean = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}