object List_String{
    def filterEvetNumber(numbers: List[Int]): List[Int] = {
        numbers.filter(_ % 2 == 0)
    }

    def filterLongStrings(strings: List[String]): List[String] = {
        strings.filter(_.length > 3)
    }
    
    def main(args: Array[String]): Unit = {
        val numbers = List(1, 2, 3, 4, 5 ,6, 7, 8, 9, 10)    
        val filteredNumbers = filterEvetNumber(numbers)
        println(s"Event number : $filteredNumbers")

        val strings = List("Scala", "Java", "Python", "C++", "JavaScript")
        val filteredStrings = filterLongStrings(strings)
        println(s"Strings with length > 3: $filteredStrings")
    }
}