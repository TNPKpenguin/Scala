object loop{
    def main(args: Array[String]): Unit = {
        for(i <- 1 to 5){
            println(s"This is interation number $i")
        }

        println("-------------------------")

        for(i <- 5 to 1 by -1){
            println(s"This is iteration number $i")
        }
    }
}