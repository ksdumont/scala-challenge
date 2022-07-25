package q02
object q02 extends App {
  def get(url: String): String = scala.io.Source.fromURL(url).mkString
  val response: String = get("https://geocoder.ca/?locate=Los Angeles&json=1")
  println(response)
}
