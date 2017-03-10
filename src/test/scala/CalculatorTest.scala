import org.scalatest.{FlatSpec, Matchers}

class CalculatorTest extends FlatSpec with Matchers {
  private val calculator = Calculator()

  "The Add function" should "return 5 for adding 2, 3" in {
    calculator.add(2, 3) shouldEqual 5
  }

  "The Subtract function" should "return 3 for subtracting 2 from 5" in {
    calculator.subtract(5, 2) shouldEqual 3
  }
  "The Multiply function" should "return 6 for multiplying 2 and 3" in {
    calculator.multiply(2, 3) shouldEqual 6
  }

  "The Divide function" should "return 2 for dividing 6 by 3" in {
    calculator.divide(6, 3) shouldEqual 2
  }
  it should "throw Exception if diving number by zero" in {
    a[ArithmeticException] should be thrownBy {
      calculator.divide(6, 0)
    }
  }
}
