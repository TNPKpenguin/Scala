object pattern{
    def main(args: Array[String]): Unit = {
        val day = "Monday"

        val result = day.match{
            case "Monday" => "Start of the week"
            case "Friday" => "End of the week"
            case _ => "Other day"
        }
        
        println(s"Result of pattern matching: $result")
    }
}