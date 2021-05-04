import org.scalatest.funsuite.AnyFunSuite

class ByNameParametersTest extends AnyFunSuite {
  test("by-name") {
    assert(5 === ByNameParameters.byValue(ByNameParameters.doCalculations()))
  }

  test("by-value") {
    assert(5 === ByNameParameters.byName(ByNameParameters.doCalculations()))
  }
}
