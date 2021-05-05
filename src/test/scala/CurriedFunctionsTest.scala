import org.scalatest.funsuite.AnyFunSuite

class CurriedFunctionsTest extends AnyFunSuite {
  test("Curried function (short) summing three values") {
    val sum = CurriedFunctions.addition(1)(2.3f)(3.02)
    assert(f"$sum%.2f" === "6.32")
  }

  test("Curried function (short) summing three values  divided into three functions") {
    val firstPart = CurriedFunctions.addition(2)_
    val almostSummed = firstPart(0.09f)
    val sum = almostSummed(1.05)
    assert(f"$sum%.2f" === "3.14")
  }

  test("Curried function (long) multiplying three values") {
    val mul = CurriedFunctions.threeD(2)(3)(4)
    assert(mul === 24)
  }

  test("Curried function (long) multiplying three values divided into three functions") {
    val firstPart = CurriedFunctions.threeD(1)
    val almost = firstPart(2)
    val mul = almost(3)
    assert(mul === 6)
  }

  test("Curried function (long) multiplying five values partially divided into two functions") {
    val secondHalf = CurriedFunctions.fiveD(2)(2)(2)
    val result = secondHalf(3)(3)
    assert(result === 72)
  }

  test("Curried function (long) multiplying values divided into two sections") {
    val result = CurriedFunctions.advancedTask(1, 4)(2, 5, 3)
    assert(result === 50)
  }

  test("Curried function (long) multiplying values divided into two sections mixed with partially applied functions") {
    val part = CurriedFunctions.advancedTask(1, _: Int)(1, _: Int, _: Int)
    val result = part(1, 1, 1)
    assert(result === 6)
  }

  test("Curried function (long) adding certain value to the point") {
    val part = CurriedFunctions.addToPointsLong(2, 3)
    val result = part(1)
    assert(result === (3, 4))
  }

  test("Curried function (short) adding certain value to the point") {
    val part = CurriedFunctions.addToPointsShort(2, 3)_
    val result = part(1)
    assert(result === (3, 4))
  }

  test("Curried function (short) summing three values mixed with partially applied functions") {
    val part = CurriedFunctions.addition(_: Int)(_: Float)(_: Double)
    val almost = part(1, _, 3)
    val sum = almost(4)
    assert(sum === 8)
  }

  test("Curried function (short) adding certain value to the point with partially applied functions and curring approach") {
    val part = (CurriedFunctions.addToPointsShort _).curried
    val result = part(1)(2)(3)
    assert(result === (4, 5))
  }
}
