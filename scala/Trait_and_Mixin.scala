object Trait_and_Mixin{
    def main(args: Array[String]): Unit = {
        trait Greeting{
            def greet(): Unit = {
                println("Hello")
            }
        }

        class MyClass extends  Greeting
        val myInstance = new MyClass
        myInstance.greet()
    }
}