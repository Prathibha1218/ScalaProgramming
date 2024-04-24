object SingletonObject{
  def main(args:Array[String]): Unit = {
    Singleton.hello()         // No need to create object.
  }
}
object Singleton{
  def hello(){
    println("Hello, This is Singleton Object")
  }
}