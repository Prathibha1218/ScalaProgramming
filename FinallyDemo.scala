import java.io.IOException
object FinallyDemo {
    def main(args: Array[String]) {
      try {
        var N = 10 / 5
      }
      catch {
        case i: IOException => {
          println("IOException occurred.")
        }
        case a: ArithmeticException => {
          println("Arithmetic Exception occurred.")
        }
      }
        finally
        {
          println("Finally block always executes")
        }
      }
  }