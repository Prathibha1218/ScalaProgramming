//object ArrayDemo {
//  def main(args: Array[String]) {
//    var days = Array("Monday", "Tuesday",
//      "Wednesday", "Thursday", "Friday",     // allocating memory of 1D Array of string.
//      "Saturday")
//    println("second element of an array is: ")
//    println(days(1)) // Accessing an array element
//    println("-----------------------------------------")
//    days(0) = "Sunday" //updating element in an array
//    println("After updation,the array elements are: ")
//    for(i<-days){
//      println(i)
//    }
//  }
//}


//adding and concatenating elements
import Array._
object ArrayDemo {
  def main(args: Array[String]) {
    var name = new Array[String](3)
    var name1 = Array("How are you?")
    name(0) = "Hi! "     // Adding element in an array
    name(1) = "My name is "
    name(2) = "Monica."
    var name2 = concat(name,name1)    //concatenating 2 strings
    println("After adding array elements : ")
    for(i<-name) {
      println(i)
    }
    println("------------------------------")
    println("Concatenated string: ")
    for (i1 <- name2) {
      print(i1)
    }
  }
}