trait Speaker {
  def speak(): Unit // Abstract method
}

trait Person1 {
  def display(): Unit = {
    println("This is display method")
  }
}

class Person2(name: String,id: Int) extends Speaker with Person1 {

  def speak(): Unit = println(s"$name says: Hello!")
  override def display(): Unit = println(s"She is $id years.")
}

object TraitsExample {
  def main(args: Array[String]): Unit = {
    val person2 = new Person2("Alice", 20)
    person2.speak()
    person2.display()
  }
}
