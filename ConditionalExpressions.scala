//if
//object ConditionalExpressions {
//  def main(args: Array[String]) {
//    var x = 10;
//    if( x < 20 ){
//      println("This is if statement");
//    }
//  }
//}

//if else
//object ConditionalExpressions {
//  def main(args: Array[String]) {
//        val result = checkIt(-10)
//        println (result)
//      }
//      def checkIt (a:Int)  =  if (a >= 0) 1 else -1    // Passing a if expression value to function
//                              //(a >= 0)? 1 : -1 ternary operator
//}

//if else if
//object ConditionalExpressions {
//  def main(args: Array[String]) {
//    var x = 30;
//
//    if( x == 10 ){
//      println("Value of X is 10");
//    } else if( x == 20 ){
//      println("Value of X is 20");
//    } else if( x == 30 ){
//      println("Value of X is 30");
//    } else{
//      println("This is else statement");
//    }
//  }
//}

object ConditionalExpressions {
  def main(args: Array[String]) {
    val x = 10
    val result = if (x > 0) "Positive" else if (x < 0) "Negative" else "Zero"
    println(result)
  }
}