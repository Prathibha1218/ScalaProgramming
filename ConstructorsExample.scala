//primary constructors
//class Students(id:Int, name:String){
//  def showDetails(){
//    println(id+" "+name);
//  }
//}
//
//object ConstructorsExample{
//  def main(args:Array[String]){
//    var s = new Students(101,"John");
//    s.showDetails()
//  }
//}

//auxiliary constructors
class Students(id:Int, name:String){
  var age:Int = 0
  def showDetails(){
    println(id+" "+name+" "+age)
  }
  def this(id:Int,name:String,age:Int){
    this(id,name)       // Calling primary constructor
    this.age = age
  }
}

object ConstructorsExample{
  def main(args:Array[String]){
    var s = new Students(101,"John",20);
    s.showDetails()
  }
}