object DataTypes {
  def printType(value: Any): Unit = {
    value match {
      case str: String =>
        println(s"$str is a String.")
      case int: Int =>
        println(s"$int is an Int.")
      case double: Double =>
        println(s"$double is a Double.")
      case boolean: Boolean =>
        println(s"$boolean is a Boolean.")
      case _ =>
        println(s"$value is of an unknown type.")
    }
  }

  def main(args: Array[String]): Unit = {
    val stringValue: String = "Hello, Scala!"
    val intValue: Int = 42
    val doubleValue: Double = 3.14
    val booleanValue: Boolean = true
    val unknownValue: Any = ('a', 1.23)

    printType(stringValue)
    printType(intValue)
    printType(doubleValue)
    printType(booleanValue)
    printType(unknownValue)
  }
}
