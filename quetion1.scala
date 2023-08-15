object quetion1 {
  val calculateInterest: Double => Double = depositAmount => {
    if (depositAmount <= 20000) {
      0.02 * depositAmount
    } else if (depositAmount <= 200000) {
      0.04 * depositAmount
    } else if (depositAmount <= 2000000) {
      0.035 * depositAmount
    } else {
      0.065 * depositAmount
    }
  }

  def main(args: Array[String]): Unit = {
    // Test cases
    val deposit1 = 15000
    val deposit2 = 50000
    val deposit3 = 300000
    val deposit4 = 2500000

    val interest1 = calculateInterest(deposit1)
    val interest2 = calculateInterest(deposit2)
    val interest3 = calculateInterest(deposit3)
    val interest4 = calculateInterest(deposit4)

    println(s"Interest for deposit of Rs. $deposit1: Rs. $interest1")
    println(s"Interest for deposit of Rs. $deposit2: Rs. $interest2")
    println(s"Interest for deposit of Rs. $deposit3: Rs. $interest3")
    println(s"Interest for deposit of Rs. $deposit4: Rs. $interest4")
  }
}
