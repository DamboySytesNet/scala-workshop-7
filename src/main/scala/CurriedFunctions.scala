import scala.collection.mutable

object CurriedFunctions {
  def main(args: Array[String]): Unit = {
//    println(addition(1)(2.3f)(3.02))

//    val a1 = addition(1)_
//    val a2 = a1(2)
//    val a3 = a2(3)
//    println(a3)
  }

  /** Part 1 */
  def addition(a: Int)(b: Float)(c: Double): Double = {
    a + b + c
  }

  /** Part 3 */
  def callByName(): mutable.Stack[Int] = {
    def whileLoop(cond: => Boolean)(body: => Unit): Unit =
      if (cond) {
        body
        whileLoop(cond)(body)
      }

    val stack = mutable.Stack[Int]()
    var i = 10
    whileLoop (i > 0) {
      stack.push(i)
      i -= 1
    }

    stack
  }
}
