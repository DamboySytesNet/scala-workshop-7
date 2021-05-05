package exercises

object Exercise1 {
  def main(args: Array[String]): Unit = {
    val a = myMethod(5, _: Int)(_: Int, 3)
    val b = a(2, 10)
    println(b)
  }

  def myMethod(a: Int, b: Int)(c: Int, d: Int): Int = {
    (a + b) * (c * d)
  }
}
