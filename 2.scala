import scala.io.StdIn

object GetSquare{

    def calculateSquare(numbers : List[Int]) : List[Int] = {
        numbers.map ( number => number * number)
    }

    def main(args: Array[String]): Unit = {
        
        println("Enter the list of numbers :")
        val input = StdIn.readLine().split(",").map(_.toInt).toList

        println(calculateSquare(input))
    }
}