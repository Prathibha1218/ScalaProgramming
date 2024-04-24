//switch case statement
object PatternMatch {
  def main(args: Array[String]) {
    println(matchTest(2))
    println(matchTest("test"))
    println(matchTest(1))
  }

  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "scala.Int"
    case _ => "many" //default statement
  }
}