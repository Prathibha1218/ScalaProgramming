object Closures {
  var number = 10
  val add = (a: Int) => {
  number = a + number;
   number;
  }
  def main(args: Array[String]): Unit = {
    number = 100
    add(50)
    println(number)
  }
}
