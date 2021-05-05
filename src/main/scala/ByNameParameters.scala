object ByNameParameters {

  def doCalculations(): Int = {
    println("Executing 'doCalculations()'")
    //Calculations...
    println("Done")
    4
  }

  def byValue(x: Int): Int = {
    println(s"By Value\nx: $x")
    val y = x + 1
    println(s"y: $y")
    y
  }

  def byName(x: => Int): Int = {
    println(s"By Name\nx: $x")
    val y = x + 1
    println(s"y: $y")
    y
  }

  /**
   * Zadanie 3
   * Jaki wynik zwróci funZ(incrementValue())?
   * Jaka jest wartość value po wywołaniu powyższej funkcji?
   */

  var value = 2

  def incrementValue(): Int = {
    value += 1
    value
  }

  def funZ(z: => Int): Int = {
    z * z * z
  }

}
