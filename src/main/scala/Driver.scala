import scala.util.{Failure, Success, Try}

object Driver extends App {
  private val obj = new SumOfList
  private val newList:List[Int] = List(1, 2, 3, 4, 5)
  private val add:Int = 0
  private val sumOfList= obj.sumOfList(newList, add)
  private val output = Try(sumOfList)
  output match {
    case Success(value) => println(value)
    case Failure(exception) => exception.getMessage
  }

}
