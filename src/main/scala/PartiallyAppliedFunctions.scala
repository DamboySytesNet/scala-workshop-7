import scala.collection.mutable

object PartiallyAppliedFunctions {
    /** Part 1 */
    def addToStack(stack: mutable.Stack[Int], number: Int): Unit = {
      stack.push(number)
    }

    /** Part 2 */
    def returner(number: Int): Int = {
      number
    }

    /** Part 3 */
    def summing(a: Int, b: Float, c: Int, d: Float): Float = {
      a + b + c + d
    }

    /** Part 4 */
    val ratio = 3
    def ratioDivider(a: Int, b: Int): Float = {
      (a + b) / ratio.toFloat
    }

    /** Part 5 */
    def discount(price: Float, discount: Float): Float = {
      price * (100 - discount) / 100
    }
}
