object list_test{
    def main(args: Array[String]): Unit = {
        val a = List(1, 2, 3 ,4, 5)
        println(s"List : $a")

        val b = Set(1, 1, 2, 3, 3)
        println(s"Set : $b")

        val c = Map("name" -> "Bas", "Age" -> 21)
        println(s"Map : $c")
    }
}