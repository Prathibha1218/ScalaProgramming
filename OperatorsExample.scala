object OperatorsExample {
    def main(args: Array[String]): Unit = {
      // Arithmetic Operators
      val a = 10
      val b = 5

      val additionResult = a + b
      val subtractionResult = a - b
      val multiplicationResult = a * b
      val divisionResult = a / b
      val modulusResult = a % b

      println(s"Addition: $additionResult")
      println("Addition: "+additionResult)
      println(s"Subtraction: $subtractionResult")
      println(s"Multiplication: $multiplicationResult")
      println(s"Division: $divisionResult")
      println(s"Modulus: $modulusResult")

      // Comparison Operators
      val x = 7
      val y = 3

      val isEqual = x == y
      val isNotEqual = x != y
      val isGreaterThan = x > y
      val isLessThan = x < y
      val isGreaterOrEqual = x >= y
      val isLessOrEqual = x <= y

      println("----------------------------------")
      println(s"Is Equal: $isEqual")
      println(s"Is Not Equal: $isNotEqual")
      println(s"Is Greater Than: $isGreaterThan")
      println(s"Is Less Than: $isLessThan")
      println(s"Is Greater or Equal: $isGreaterOrEqual")
      println(s"Is Less or Equal: $isLessOrEqual")

      // Logical Operators
      val p = true
      val q = false

      val andResult = p && q
      val orResult = p || q
      val notResult = !p

      println("----------------------------------")
      println(s"AND: $andResult")
      println(s"OR: $orResult")
      println(s"NOT: $notResult")

      // Assignment Operators
      var mutableVar = 5
      mutableVar += 3 // Equivalent to mutableVar = mutableVar + 3

      println("----------------------------------")
      println(s"Mutable Variable: $mutableVar")
    }
}
