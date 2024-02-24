object condition{
    def main(args: Array[String]): Unit = {
        var max = 0
        val x = 10
        if(x > max){
            max = x
        }else if(x < max){
            max = max
        }else{
            max = max
        }
        println(s"max : $max")
    }
}