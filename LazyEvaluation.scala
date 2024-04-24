class strict {
  val e = {
    println("strict")
    8
  }
}
class lazyeval {   //this function will not be accessed until it is called
  lazy val l = {
    println("lazy")
    1
  }
}
object LazyEvaluation {
  def main(args: Array[String]): Unit = {
    val x = new strict;
    val y = new lazyeval;
    println(x.e)
    println(y.l)
  }
}
