object HigherOrderFunctions {
  def main(args: Array[String]) = {
    functionExample(25, multiplyBy2)                   // Passing a function as parameter
  }
  def functionExample(a:Int, f:Int=> Any):Unit = {
    println(f(a))                                   // Calling that function
  }
  def multiplyBy2(a:Int):Int = {
    a*2
  }
}