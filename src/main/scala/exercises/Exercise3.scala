package exercises

object Exercise3 {

  var value = 2

  def incrementValue(): Int = {
    value += 1
    value
  }

  def funZ(z: => Int): Int = {
    //(2+1) * (3+1) * (4+1) = 3 * 4 * 5 = 60
    z * z * z
  }

  def main(args: Array[String]): Unit = {
    println(funZ(incrementValue()))
    println(s"Value: $value")
  }
}
