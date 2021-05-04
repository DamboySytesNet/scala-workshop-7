
object Closure {
  /** Part 1 */
  var factor = 10
  def multiplication(a: Int): Int = {
    a * factor
  }

  val changeFactor: Int => Unit = (newFactor: Int) => factor = newFactor

  val adder: Int => Int = (a: Int) => a + factor

  /** Part 2 */
  var rateChanged = false
  var changeRate = 0
  var result = 0
  def changeRate(newRate: Int): Unit = {
    changeRate = newRate
    rateChanged = true
  }

  def rateHandler(part: Int): Int = {
    if (rateChanged) {
      rateChanged = false
      result = changeRate * part
      result
    } else {
      result
    }
  }

  /** Part 3 */
  var day = 5

  val setDay: Int => Unit = (newDay) => day = newDay

  def printDay(whichDay: Int): String = {
    s"Currently it is day $whichDay"
  }
}
