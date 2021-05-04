import scala.collection.mutable

object PartiallyAppliedFunctions {
    def main(args: Array[String]): Unit = {
//      val a = mutable.Stack[Int]();
//      val rememberingStack = addToStack(a, _: Int)
//
//      rememberingStack(13)
//      rememberingStack(8)
//      rememberingStack(5)
//      rememberingStack(3)
//      rememberingStack(2)
//      rememberingStack(1)
//
//      println(a)

//      val rememberingNothing = returner(_: Int)
//      print(rememberingNothing(13))

//      val args = lotsOfArguments(1, 2.1f, _: Int, _: Float)
//      val a = args(3, 4.5f)
//      println(a)

//      val b = ratioMultiplier(_: Int, _: Int)
//      println(b(2, 3))
    }

    /** Part 1 */
    def addToStack(stack: mutable.Stack[Int], number: Int): Unit = {
      stack.push(number)
    }

    /** Part 2 */
    def returner(number: Int): Int = {
      number
    }

    /** Part 3 */
    def lotsOfArguments(a: Int, b: Float, c: Int, d: Float): Float = {
      a + b + c + d
    }

    /** Part 4 */
    val ratio = 3
    def ratioMultiplier(a: Int, b: Int): Float = {
      (a + b) / ratio.toFloat
    }
}
