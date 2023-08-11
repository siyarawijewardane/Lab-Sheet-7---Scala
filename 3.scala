import scala.io.StdIn

object FindPrime{

    def filterPrime( numbers : List[Int]) : List[Int] = {

        numbers.filter( number => {
            
            if (number <= 1) false
            else if (number <= 3) true
            else if (number % 2 == 0 || number % 3 == 0) false
            else {
                var i = 5
                var isPrime = true
                while (i * i <= number && isPrime) {
                if (number % i == 0 || number % (i + 2) == 0)
                    isPrime = false
                i += 6
                }
                isPrime
            }

        }
        )
    }

    def main(args: Array[String]): Unit = {
        
            println("Enter the list of numbers : ")
            val input = StdIn.readLine().split(",").map(_.toInt).toList

            println(filterPrime(input))
    }
}