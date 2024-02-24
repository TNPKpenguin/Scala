object Higher_function{
    def main(args: Array[String]): Unit = {
        def operateNumbers(x: Int, y: Int, operation: (Int, Int) => Int): Int = {
            operation(x, y)
        }        

        val addition = operateNumbers(5, 3, (a, b) => a+b)
        println(s"Addition result: $addition")
    }
}