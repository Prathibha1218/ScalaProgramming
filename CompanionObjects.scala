class  Account {
  val id = Account.newUniqueNumber()
  private var balance = 0.0
  def deposit (amount: Double) {balance+= amount}
  def balanceEnquiry() =balance
}
object Account{ //companion object
  private var lastNumber = 0.0
  private def newUniqueNumber() = {lastNumber += 1; lastNumber}
}
object CompanionObjects {
  def main(args: Array[String]): Unit = {
  var accno1 = new Account()
  println("Current new account number= " + accno1.id )
  accno1.deposit(1000) 
  println("New current balance= "+ accno1.balanceEnquiry())
  }
}