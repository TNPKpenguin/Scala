object collection{
    def main(args: Array[String]): Unit = {
        val numbers = List(1, 2, 3, 4, 5)
        val squaredNumbers = numbers.map(x => x*x)
        println(s"Squared numbers : $squaredNumbers")
    }
}