object question3 {
  object StringFormattingExample extends App {

    // Method to convert input string to uppercase
    def toUpper(input: String): String = input.toUpperCase

    // Method to convert input string to lowercase
    def toLower(input: String): String = input.toLowerCase

    // Method to format names using the provided function
    def formatNames(name: String)(formatter: String => String): String = {
      formatter(name)
    }

    def main(args: Array[String]): Unit = {
      // Test inputs
      val names = List("Benny", "Niroshan", "Saman", "Kumara")

      // Apply formatting and print the results
      for (name <- names) {
        val upperResult = formatNames(name)(toUpper)
        val lowerResult = formatNames(name)(toLower)
        println(s"Uppercase format of $name: $upperResult")
        println(s"Lowercase format of $name: $lowerResult")
      }
    }
  }

}
