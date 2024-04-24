////private class
//class AccessExample{
//  private var a:Int = 10
//  def show(): Unit = {
//    println(a)
//  }
//}
//object AccessModifiers{
//  def main(args:Array[String]): Unit = {
//    var p = new AccessExample()
//    p.a = 12 //a is declared as private, so we cannot access
//    p.show()
//  }
//}

//protected class
class AccessExample{
  protected var a:Int = 100
}
class SubClass extends AccessExample{
  def display(): Unit = {
    println("a = "+a)
  }
}
object AccessModifiers{
  def main(args:Array[String]): Unit = {
    var s = new SubClass()
    s.display()
  }
}

