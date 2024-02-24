class Animal(name: String){
    def makeSound(): Unit = {
        println("Generic animal sound")
    }
}

class Dog(name: String) extends Animal(name){
    override def makeSound(): Unit = {
        println("Woof!")
    }
}

object extend_test{
    def main(args: Array[String]): Unit = {
        val a = new Animal("A")
        a.makeSound()

        val d = new Dog("D")
        d.makeSound()
    }
}