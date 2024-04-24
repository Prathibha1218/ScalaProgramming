 class BaseClass {    // Base class
    var Name: String = "Mark"
  }

  class ChildClass extends BaseClass {  // Derived class using extends keyword
    var Article_no: Int = 130

    def details(){       // Method
      println("Author name: " + Name);
      println("Total numbers of articles: " + Article_no);
    }
  }

  object Inheritance {
    def main(args: Array[String]): Unit = {
      val obj = new ChildClass();    // Creating object of derived class
      obj.details();
    }
  }
