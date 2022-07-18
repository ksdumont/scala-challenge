import scala.annotation.tailrec

object q01 extends App {

  def sum(list: List[Int]): Int = list match {
    case Nil => 0
    case x :: xs => x + sum(xs)
  }

  @tailrec
  private def sumWithAccumulator(list: List[Int], accumulator: Int): Int = {
    list match {
      case Nil => accumulator
      case x :: xs => sumWithAccumulator(xs, accumulator + x)
    }
  }

  // get length of args
  val length: Int = args.length

  // check to make sure there are at least two numbers
  if (length < 2) {
    println("Please provide at least two numbers so I can add something together.")
  } else {
    try {
      // converts args to int
      val intArr: Array[Int] = args.map(_.toInt)
      // convert Array to list
      val intList = intArr.toList
      // filter for real numbers
      val filtered = intList.filter(_ > 0)

      // tail recursive method to get final sum
      val finalSum: Int = sumWithAccumulator(filtered, 0)

      // get final sum
      // val finalSum = sum(filtered)

      // format args for printing
      val numbers: String = args.mkString(" + ")
      println(s"The result of adding ${numbers} is ${finalSum}")
    } catch {
      case e: NumberFormatException => println(e)
        println("Exception: All arguments must be a number")
    }
  }
}


