import scala.io.StdIn

object FilterEven{

    def filterEvenNumbers(numbers : List[Int]) : List[Int] = {

        numbers.filter(number => number % 2 ==0 )
    }

    def main(args: Array[String]): Unit = {

        println("Enter the list of numbers : ")
        val input = StdIn.readLine().split(",").map(_.toInt).toList
        
        println(filterEvenNumbers(input))
    }
}