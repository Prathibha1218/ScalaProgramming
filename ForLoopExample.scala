object ForLoopExample {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 5) {         //using to (includes start and end value)
      println("i using to " + i)
    }
    println("-------------------------")
    for (i <- 1 until  5) {      //using until (includes start and excludes end value)
      println("i using until " + i)
    }
    println("-------------------------")
    for (i <- 11 to 13) {      //Nested Loop
      for (j <- 11 to 13) {
        println(" using multiple ranges " + i + " " + j)
              }
      }
//    for (i <- 11 to 13; j <- 11 to 13)
//    println("using multiple ranges " + i+ " "+j)
    println("-------------------------")
    val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9)  //using list
    for (i <- lst) {
      println("i using list " + i)
    }
    println("-------------------------")
    for (i <- lst; if i < 7) {      //using filters
      println("i using Filters " + i)
    }
    println("-------------------------")
      val result = for (a <- lst;
       if a!=2; if a<8 ) yield a    //using yield
      for (i <- result) {
        println(i)
      }
    }
  }


