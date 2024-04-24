object FunctionsDemo {
  object Math {
    //def functionName ([list of parameters and datatype]) : [return type]
    def addition(x : Int, y : Int) : Int = {
      return x+y
    }
  def square(x:Int) = x*x;
  }
  def add(x: Int, y : Int) = x+y;
  def subtract(x: Int, y : Int): Int ={
    return x-y
  }
  def multiply(x: Int, y : Int) = x*y
  def divide(x:Int, y: Int): Int = {
    x/y;                        //without return keyword
  }
  def main(args:Array[String]): Unit = {
    println(Math.addition(20,50))
    println(Math square(7))
    println(add(45,15));
    println(subtract(45,15))
    println(multiply(45,15))
    println(divide(45,15))
  }
}

