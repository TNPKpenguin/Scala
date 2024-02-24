object test2{
  def main(args: Array[String]): Unit = {
    val x: Int = 10
    println(s"x = $x");

    var y: String = "Hello"
    println(s"y = $y")

    y = "Hello World"
    println(s"y = $y")
    
    def add(x: Int, y: Int): Int = {
      x + y
    }
    var z: Int = add(1, 2)
    println(s"z = $z") 
  }
}