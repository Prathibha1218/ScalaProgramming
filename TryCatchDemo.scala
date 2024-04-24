import java.io.IOException
object TryCatchDemo {
  def main(args: Array[String]) {
    try {
      var N = 5 / 0
    }
    catch {
      case i: IOException => {
        println("IOException occurred.")
      }
      case a: ArithmeticException => {
        println("Arithmetic Exception occurred.")
      }
    }
  }
}

