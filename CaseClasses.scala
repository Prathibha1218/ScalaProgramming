//case class and case Object
//case class employee(name: String, age: Int)
//object CaseClasses {
//  def main(args: Array[String]) {
//    var c = employee("Damon", 23)
//    println("Name of the employee is " + c.name);
//    println("Age of the employee is " + c.age);
//  }
//}

//copy method & equal method
//object CaseClasses {
//  def main(args: Array[String]) {
//    case class Fruits(name: String)
//    val firstFruit = Fruits("Orange")
//    val secondFruit = firstFruit.copy()
//    println(secondFruit.name)
//    println(firstFruit == secondFruit)
//  }
//}

//pattern match
object CaseClasses {
  def main(args: Array[String]) {
    println(matchTest(2))
    println(matchTest("test"))
    println(matchTest(1))
  }

  def matchTest(x: Any): Any = x match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "scala.Int"
    case _ => "many" //default statement
  }
}