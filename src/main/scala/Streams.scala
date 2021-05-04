object Streams {

  def initA(): Stream[Int] = {
    val stream = 1 #:: 2 #:: 3 #:: Stream.empty
    stream
  }
  def initB(): Stream[Int] = {
    val stream = Stream.cons(1, Stream.cons(2, Stream.cons(3, Stream.empty)))
    stream
  }
  def initC(): Stream[Int] = {
    val stream = (1 to 3).toStream
    stream
  }

  //these methods always create new collections
  def transformerMethods() = {
    val stream = (1 to 25).toStream
      .map(_ * 2)
      .filter(_ % 10 == 0)
      .reverse
      .take(3)
    stream
  }
}
