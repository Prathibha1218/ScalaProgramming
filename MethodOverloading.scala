class example {
  def func(a: Int) {
    println("First Execution:" + a);
  }
  def func(a: Int, b: Int) {
    var sum = a + b;
    println("Second Execution:" + sum);
  }

  def func(a: Int, b: Int, c: Int) {
    var product = a * b * c;
    println("Third Execution:" + product);
  }
}
object MethodOverloading {
  def main(args: Array[String]) {
    var ob = new example();
    ob.func(120);
    ob.func(50, 70);
    ob.func(10, 5, 6);
  }
}
