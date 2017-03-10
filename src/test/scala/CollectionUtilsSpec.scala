import org.scalatest.{FlatSpec, Matchers}

class CollectionUtilsSpec extends FlatSpec with Matchers {
  private val utils = CollectionUtils()

  "The reverse function" should "Return reverse of list" in {
    utils.reverse(List(1, 2, 3)) shouldEqual List(3, 2, 1)
  }

  "The reverse function" should "Return emptyList for empty input list" in {
    utils.reverse(List.empty[Int]) shouldEqual List.empty[Int]
  }
}
