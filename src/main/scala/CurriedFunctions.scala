
object CurriedFunctions {
  /** Part 1 */
  def addition(a: Int)(b: Float)(c: Double): Double = {
    a + b + c
  }

  /** Part 2 */
  def threeD(x: Int): Int => Int => Int = (y: Int) => (z: Int) => x * y * z
  def fiveD(x: Int): Int => Int => Int => Int => Int = (y: Int) => (z: Int) => (a: Int) => (b: Int) => x * y * z * a * b

  /** Part 3 */
  def advancedTask(a: Int, b: Int): (Int, Int, Int) => Int = (c: Int, d: Int, e: Int) => {
    (a + b) * (c + d + e)
  }

  /** Part 4 */
  def addToPointsLong(x: Int, y: Int): Int => (Int, Int) = (r: Int) => {
    (x + r, y + r)
  }
  def addToPointsShort(x: Int, y: Int)(r: Int): (Int, Int) = {
    (x + r, y + r)
  }
}
