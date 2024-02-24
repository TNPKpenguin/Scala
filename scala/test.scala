class Person(name: String, age: Int){
  def displayInfo(): Unit = {
    println(s"Name: $name, Age = $age")
  }
}

object test{
  def main(args: Array[String]): Unit = {
    val person = new Person("John", 25)
    person.displayInfo()
  }
}