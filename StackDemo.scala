import scala.collection.mutable.Stack
object StackDemo {
    def main(args: Array[String]) {
      var s = Stack[Int]()
      s.push(5)     //pushing the elements
      s.push(1)
      s.push(2)
      println("s:" + s)
      var s2 = Stack[Int]()
      s2.push(5, 1, 2)  //pushing the elements
      println("s2:" + s2)
      println("Top element: "+s.top) //returns top element
      println("Popped:" + s.pop)     //popping the elements
      println("Popped:" + s.pop)
      println("Popped:" + s.pop)
      println("Empty:" + s.isEmpty)   //checking if element is present or not
    }
  }
