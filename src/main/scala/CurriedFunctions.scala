
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

  /** Zadanie 1
   *
   * Napisz funkcję, której wywołanie będzie wyglądało
   * w sposób następujący:
   *
   * val a = myMethod(5, _: Int)(_: Int, 3)
   * val b = a(2, 10)
   * // (5 + 2) * (3 * 10) = 210
   *
   * oraz jej zadaniem będzie zsumowanie argumentów
   * w pierwszym nawiasie i pomnożenie ich przez
   * iloczyn liczb podanych w drugim nawiasie
   */

  /** Zadanie 2
   *
   * Zmodyfikuj składnię funkcji poniżej na jej
   * dłuższy odpowiednik
   *
   * def addition(a: Int)(b: Int, c: Int, d: Int): Int = {
   *   a * (b + c + d)
   * }
   */
}
