object while_loop{
    def main(args: Array[String]): Unit = {
        var j = 0;
        while (j < 3){
            println(s"Value of j : $j")
            j += 1
        }
    }
}