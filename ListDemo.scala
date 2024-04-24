object ListDemo {
  var mylist: List[Int] = List(1,2,3,4,5,6);
  var days: List[String] = List("Sun","Mon","Tue","Wed")
  def main(args: Array[String]): Unit = {
    println(mylist)
    println(days)
    println(0 :: mylist)
    println(days.head)
    println(days.tail)
    println(mylist.tail)
    println(mylist.isEmpty)
    println(days.reverse)
    println(mylist.max)
    println("-----------------")
    mylist.foreach( println )
    println("-----------------")
    for(i <- days)
      println(i)
  }
}
