package q01
import scala.annotation.tailrec
import ArgParser._

object q01 extends App {

  def sum(list: List[Int]): Int = list match {
    case Nil => 0
    case x :: xs => x + sum(xs)
  }

  @tailrec
  private def sumWithAccumulator(list: Seq[Int], accumulator: Int): Int = {
    list match {
      case Nil => accumulator
      case x :: xs => sumWithAccumulator(xs, accumulator + x)
    }
  }

  def run(arguments: Arguments): Unit = {
    val sum = sumWithAccumulator(arguments.addends, 0)
    println(s"sum is ${sum}")
  }

  parser.parse(args, Arguments()) match {
    case Some(arguments) => run(arguments)
    case None =>
  }
}
