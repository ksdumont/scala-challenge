object Add {
  def main(args: Array[String]): Unit = {

    // get length of args
    val length: Int = args.length

    // check to make sure there are at least two numbers
    if (length < 2) {
      println("Please provide at least two numbers so I can add something together.")
      return
    }

    try {
      // converts args to int
      val intArr: Array[Int] = args.map(_.toInt)
      // sums all args
      val sum = intArr.sum
      // format args for printing
      val numbers: String = args.mkString(", ")
      println(s"The result of adding ${numbers} is ${sum}")
    } catch {
      case e: NumberFormatException => println(e)
      println("Exception: All arguments must be a number")
    }
  }
}

