object Factorial{
    def main(args: Array[String]): Unit = {
        def factorial(n: Int): Int = {
            if (n == 1) 1
            else
                n * factorial(n-1)
        }
        var n = 5
        println(s"$n! = ${factorial(n)}")
    }
}