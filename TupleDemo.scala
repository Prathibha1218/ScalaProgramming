object TupleDemo {
  val mytuple = (1, 2, "hello",true)  //multiple data types
  val mytuple1 = new Tuple4(1,2,"hello", (2,3));  //declaring a tuple with size as 4
  def main(args: Array[String]): Unit = {
    println(mytuple1._3)
    println(mytuple1._4)
    println("--------------------")
    mytuple1.productIterator.foreach {  //using foreach loop
      i => println(i);
    }
    println("--------------------")
    println( 1 -> "Tom" -> true -> 2.0) //another way of declaring a tuple
    println(mytuple1._4._2) //accessing the sub value
  }
}
