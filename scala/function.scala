object function{
    def main(args: Array[String]): Unit = {
        def squared(x: Int): Int = {
            x*x
        }

        val area = squared(3)
        println(s"squared : $area")
    }
}