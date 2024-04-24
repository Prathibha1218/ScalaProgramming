object MapsDemo {
  val mymap: Map[Int, String] = Map(101 -> "A", 102 -> "B", 103 -> "C")
  val mymap1: Map[Int, String] = Map(104 -> "E")
  def main(args: Array[String]): Unit = {
    println(mymap)
    println("Returning 101 value: "+mymap(101))
    println("Keys: "+mymap.keys)
    println("Values: "+mymap.values)
    println("Checking if map is empty or not:"+mymap.isEmpty)
    println("-----------------")
    mymap.keys.foreach { key =>
      println("Keys: " + key)
      println("Values: " + mymap(key))
    }
    println("-----------------")
    println("Checking if 300 is present or not: "+mymap.contains(300))
    println("Size of the map: "+mymap.size)
    println(mymap ++ mymap1) //Concatenation of 2 maps
  }
}
