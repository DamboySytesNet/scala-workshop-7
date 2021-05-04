import org.scalatest.funsuite.AnyFunSuite

class StreamsTest extends AnyFunSuite{
  test("creating stream") {
    val array = Array(1, 2, 3)
    val streamA = Streams.initA()
    val streamB = Streams.initB()
    val streamC = Streams.initC()

    //Head has already been computed
    println(streamA.head)
    //Tail will be computed later ;)
    println(streamA.tail)

    assert(streamA.length == array.length)
    assert(streamA.toArray.sameElements(array))

    assert(streamB.length == array.length)
    assert(streamB.toArray.sameElements(array))

    assert(streamC.length == array.length)
    assert(streamC.toArray.sameElements(array))
  }

  test("basic stream methods") {
    val stream = Streams.transformerMethods()
    assert(stream.sum == 50 + 40 + 30)
    assert(stream.size == 3)
    assert(stream.max == 50)
    assert(stream.min == 30)
    assert(stream.toArray.sameElements(Array(50, 40, 30)))
  }
}
