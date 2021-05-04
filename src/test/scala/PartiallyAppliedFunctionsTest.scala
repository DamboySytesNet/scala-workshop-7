import org.scalatest.funsuite.AnyFunSuite
import scala.collection.mutable

class PartiallyAppliedFunctionsTest extends AnyFunSuite {
  test("Partially applied function with stack") {
    val stack = mutable.Stack[Int]();
    val rememberingStack = PartiallyAppliedFunctions.addToStack(stack, _: Int)

    rememberingStack(13)
    rememberingStack(8)
    rememberingStack(5)
    rememberingStack(3)
    rememberingStack(2)
    rememberingStack(1)

    assert(stack.length === 6)
    assert(stack.top === 1)
  }

  test("Partially applied function with single argument") {
    val rememberingNothing = PartiallyAppliedFunctions.returner(_: Int)
    assert(rememberingNothing(13) === 13)
  }

  test("Partially applied function with missing parameters not in order") {
    val args = PartiallyAppliedFunctions.summing(_: Int, 2.1f, _: Int, _: Float)
    val result = args(1, 2, 3.1f)
    assert(result === 8.2f)
  }

  test("Partially applied function, with missing parameters not in order, as closure") {
    val args = PartiallyAppliedFunctions.ratioDivider(_: Int, 3)
    val result = args(2)
    assert(f"$result%.1f" === "1.7")
  }

  test("Partially applied function, without parameters") {
    val price = PartiallyAppliedFunctions.discount _
    val discountedBy = price(300, _: Float)
    val result = discountedBy(10)

    assert(result === 270)
  }

  test("Partially applied function, without types") {
    val add = PartiallyAppliedFunctions.ratioDivider(3, _)
    val result = add(3)

    assert(result === 2)
  }

  test("Partially applied function, with curring approach") {
    val add = (PartiallyAppliedFunctions.plus _).curried
    val result = add(3)(5)

    assert(result === 8)
  }
}
