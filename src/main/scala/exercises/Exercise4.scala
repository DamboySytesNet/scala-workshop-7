package exercises

object Exercise4 {
  def main(args: Array[String]): Unit = {
    val stream = (1 to 9).toStream
      .filter(_ % 3 != 0)
      .reverse
      .map(_ + 96)
      .map(_.toChar)
      .toList
    println(stream)
  }
}
