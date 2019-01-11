object Factorial extends App {

  def isFactorial(num1:Int): Unit ={
    var x = 1
    var factorial = 1;
    while (factorial < num1){
      x = x + 1
      factorial = factorial * x;
    }

    if(factorial == num1) print(num1,x)
    else println("NONE")

  }

  isFactorial(7257600)


}
