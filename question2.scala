object question2 {
  val input = args(0).toInt

  val result = input match {
    case x if x < 0 => "Negative"
    case 0 => "Zero"
    case x if x % 2 == 0 => "Even number"
    case _ => "Odd number"
  }

  def main(args: Array[String]): Unit = {
    println(result)
  }
}
