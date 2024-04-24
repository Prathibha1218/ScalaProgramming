//object Strings {
//  var str1 = "Hello"
//  val str2: String = "This is a String"
//  def main(args: Array[String]) {
//    println(str1);
//    println(str2);
//  }
//}

//finding length, concatenation,upper and lower case, substring, trim, replace
//object Strings {
//  var str1: String = "'This is a String'"
//  var str2 = " Hello!   "
//  var str3 = " Welcome to scala"
//  def main(args: Array[String]) {
//    var len1= str1.length();
//    var newstr = str2.concat(str3)
//    println("The length of "+str1+ " is: "+len1);
//    println("Concatenated string: "+ newstr)
//    println("Upper Case String: "+str3.toUpperCase())
//    println("Lower Case String: "+str3.toLowerCase())
//    println("Substring: "+str2.substring(0,6))
//    println("Trimmed String: "+str2.trim)
//    var replacedStr = str1.replace("String", "Scala")
//    println("Replaced String: "+ replacedStr)
//    println("Char At method: "+str3.charAt(7))
//  }
//}

//String Interpolation
object Strings {
  def main(args: Array[String]) {
    var name = "Mark"
    var age = 18
    var a = 9.01
    println(name+ " is " +  age +" years old")
    println(s"$name is $age years old")  // allows us to pass variable in string object
    println("Value of a is $a.2f")
    println(f"Value of a is $a%.2f") // formats string output
    println(raw"Hello \nWorld") //
  }
}