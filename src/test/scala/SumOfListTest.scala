import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SumOfListTest extends AnyFlatSpec with Matchers {
  val testObj = new SumOfList

  "it " should "match with 0 if empty list is passed" in {
    val list = List().empty
    val actualOutput = testObj.sumOfList(list, 0)
    val expectedOutput = 0
    expectedOutput shouldBe actualOutput
  }

  "it " should "match with sumOfList if integer of list is passed" in {
    val list = List(1, 2, 3, 4, 5)
    val actualOutput = testObj.sumOfList(list, 0)
    val expectedOutput = 15
    expectedOutput shouldBe actualOutput
  }

  "it " should "not match with other sumOfList if integer of list is passed" in {
    val list = List(1, 2, 3, 4, 5)
    val actualOutput = testObj.sumOfList(list, 0)
    val expectedOutput = 20
    assert(expectedOutput != actualOutput)
  }

  "it " should "match with sumOfList if negative integer of list is passed" in {
    val list = List(1, -2, -3, 4, 5)
    val actualOutput = testObj.sumOfList(list, 0)
    val expectedOutput = 5
    expectedOutput shouldBe actualOutput
  }

  "it " should "match with sumOfList if list contain only two element" in {
    val list = List(1, 10)
    val actualOutput = testObj.sumOfList(list, 0)
    val expectedOutput = 11
    expectedOutput shouldBe actualOutput
  }

  "it " should "match with same number if list contain only one element" in {
    val list = List(10)
    val actualOutput = testObj.sumOfList(list, 0)
    val expectedOutput = 10
    expectedOutput shouldBe actualOutput
  }
}
