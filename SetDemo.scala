import scala.collection.{SortedSet, mutable}
object SetDemo {
  var myset: Set[Int] = Set(1, 5,3, 6, 6);
  var days: Set[String] = Set("Sun", "Mon", "Tue", "Wed")
  var myset1: Set[Int] = Set(3,6,1,0)
  var sortedSet : SortedSet[Int] = mutable.SortedSet(3,7,5,6,1,0)
  def main(args: Array[String]): Unit = {
    println(myset)
    println(days)
    println(sortedSet)
    println(myset + 10)  //Adding 10 to the set
    println("Checking if Sat is present in the list: "+ days("Sat"))
    println("First value in the Set: "+days.head)
    println("Values Except for the first element: "+days.tail)
    println("Checking if set is empty or not: "+myset.isEmpty)
    println(myset ++ myset1) //Concatenation
    println(myset.++(myset1)) //Concatenation
    println("Intersection: "+myset.&(myset1))
    println("Intersection: "+myset.intersect(myset1))
    myset1.foreach(println)
    println("-----------------")
    for (day <- days){
      println(day)
    }
}
}