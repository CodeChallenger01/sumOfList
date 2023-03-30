import scala.annotation.tailrec

class SumOfList {
  /*A method to add sum of list by using tail recursion*/
  @tailrec
  final def sumOfList(list: List[Int], add: Int): Int = {
    list match {
      case Nil => 0
      case head :: Nil => add + head
      case head :: tail => sumOfList(tail, add + head)
    }
  }
}

