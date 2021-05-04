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

}
