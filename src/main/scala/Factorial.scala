

object Factorial extends App {

  def isFactorial(num1:Int): Unit ={
    var iterator  = 1
    var factorial = 1;
    while (factorial < num1){
      iterator = iterator + 1
      factorial = factorial *iterator;
    }

    if(factorial == num1) print(num1,iterator)
    else println("NONE")

  }

  isFactorial(7257600)

}
