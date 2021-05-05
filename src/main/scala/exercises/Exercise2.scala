package exercises

object Exercise2 {
  def main(args: Array[String]): Unit = {
    val a = addition(2)(3, 4, 5)
    println(a)

    val b = addition_transformed(2)(3, 4, 5)
    println(b)
  }

  def addition(a: Int)(b: Int, c: Int, d: Int): Int = {
    a * (b + c + d)
  }

  def addition_transformed(a: Int): (Int, Int, Int) => Int = (b: Int, c: Int, d: Int) => {
    a * (b + c + d)
  }
}
