//class ExceptionExample2 {
//    def validate(age: Int) = {
//      if (age < 18)
//        throw new ArithmeticException("You are not eligible")
//      else println("You are eligible")
//    }
//  }
//  object ThrowDemo {
//    def main(args: Array[String]) {
//      var e = new ExceptionExample2()
//      e.validate(10)
//    }
//  }


class ExceptionExample2 {
  def validate(age: Int) = {
    try {
      if (age < 18)
        throw new ArithmeticException("You are not eligible")
      else println("You are eligible")
    } catch {
      case ex: ArithmeticException => println(s"Exception caught: ${ex.getMessage}")
    } finally {
      println("Validation completed")
    }
  }
}
object ThrowDemo {
  def main(args: Array[String]) {
    var e = new ExceptionExample2()
    e.validate(20)
  }
}
