import org.scalatest.funsuite.AnyFunSuite
import scope.ClosureOtherScope

class ClosureTest extends AnyFunSuite {
  test("Multiplication with factor outside of function body") {
    Closure.changeFactor(10)
    assert(Closure.multiplication(5) === 50)
    assert(Closure.multiplication(5) === 50)
    Closure.changeFactor(100)
    assert(Closure.multiplication(5) === 500)
  }

  test("Addition with factor outside of function body") {
    Closure.changeFactor(10)
    assert(Closure.adder(5) === 15)
    assert(Closure.adder(5) === 15)
    Closure.changeFactor(1)
    assert(Closure.adder(5) === 6)
  }

  test("Use case with rate handler") {
    var result = Closure.rateHandler(10)
    assert(result === 0)

    Closure.changeRate(2)

    result = Closure.rateHandler(10)
    assert(result === 20)

    result = Closure.rateHandler(20)
    assert(result === 20)

    Closure.changeRate(3)

    result = Closure.rateHandler(30)
    assert(result === 90)
  }

  test("Using class from different package (scope)") {
    Closure.setDay(5)
    val otherScope = new ClosureOtherScope
    var result = otherScope.doTask(Closure.printDay)

    assert(result === s"Currently it is day 5")

    Closure.setDay(1)
    result = otherScope.doTask(Closure.printDay)

    assert(result === s"Currently it is day 1")

    result = otherScope.doTask(Closure.printDay)

    assert(result === s"Currently it is day 1")
  }
}
