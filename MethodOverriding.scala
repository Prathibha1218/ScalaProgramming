class Vehicle{
  def run(){
    println("vehicle is running")
  }
}
class Bikes extends Vehicle{
  override def run(){
    println("Bike is running")
  }
}
object MethodOverriding{
  def main(args:Array[String]){
    var b = new Bikes()
    b.run()
  }
} 