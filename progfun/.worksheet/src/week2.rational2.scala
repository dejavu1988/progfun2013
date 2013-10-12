package week2

object rational2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  val x = new Rational(1, 3);System.out.println("""x  : week2.Rational = """ + $show(x ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(30); 

  val y = new Rational(5, 7);System.out.println("""y  : week2.Rational = """ + $show(y ));$skip(11); val res$2 = 
  x.add(y);System.out.println("""res2: week2.Rational = """ + $show(res$2));$skip(30); 

  val z = new Rational(3, 2);System.out.println("""z  : week2.Rational = """ + $show(z ));$skip(18); val res$3 = 
  x.sub(y).sub(z);System.out.println("""res3: week2.Rational = """ + $show(res$3));$skip(12); val res$4 = 

  y.add(y);System.out.println("""res4: week2.Rational = """ + $show(res$4));$skip(15); val res$5 = 
  
  x.less(y);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(11); val res$6 = 
  x.max(y);System.out.println("""res6: week2.Rational = """ + $show(res$6));$skip(83); val res$7 = 
  /*val strange = new Rational(1, 0)
  strange.add(strange)*/
  
  new Rational(2);System.out.println("""res7: week2.Rational = """ + $show(res$7))}
}

class Rational(x: Int, y: Int) {
	require(y != 0, "denominator must be nonzero")
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a
    else gcd(b, a % b)
  val numer = x / gcd(x, y)
  val denom = y / gcd(x, y)
	
	def this(x: Int) = this(x, 1)
	
	def less(that: Rational):Boolean = numer * that.denom < that.numer * denom
	
	def max(that: Rational):Rational = if (this.less(that)) that else this
	
  def add(that: Rational) = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
  }

  def sub(that: Rational) = add(that.neg)

  def neg: Rational = {
    new Rational(-numer, denom)
  }

  override def toString = numer + "/" + denom

}
