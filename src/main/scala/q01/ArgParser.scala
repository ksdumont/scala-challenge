package q01

object ArgParser {
  case class Arguments(addends: Seq[Int] = List.empty)

  val parser = new scopt.OptionParser[Arguments](programName = "q01") {
    opt[Seq[Int]]('a', name = "addends")
      .required()
      .text("comma separated list of numbers to be added")
      .action((value, arguments) => arguments.copy(addends = value))
  }
}
