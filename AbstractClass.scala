 abstract class Bike {
    def run()
  }

  class Hero extends Bike {
    def run() {
      println("Bike is running")
    }
  }

  object AbstractClass {
    def main(args: Array[String]): Unit = {
      var h = new Hero()
      h.run()
    }
  }
