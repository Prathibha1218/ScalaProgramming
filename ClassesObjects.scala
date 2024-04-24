class Student{
  var id:Int = 20;
  var name:String = "John";
}
object ClassesObjects{
  def main(args:Array[String]): Unit = {
    var s = new Student()               // Creating an object
    println(s.id+" "+s.name);
  }
}
