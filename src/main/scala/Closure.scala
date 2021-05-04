object Closure {
  def main(args: Array[String]): Unit = {
//    result = rateHandler(10)
//    println(result)
//    changeRate(2)
//    rateHandler(10)
//    println(result)
//    rateHandler(20)
//    println(result)
//    rateHandler(30)
//    println(result)
  }

  /** Part 1 */
  val factor = 10
  def multiplication(a: Int): Int = {
    a * factor
  }

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
}
