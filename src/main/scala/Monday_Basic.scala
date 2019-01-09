object Monday_Basic extends App {

  //Basic
  //Output "Hello World via the println() method"
  println("Hello World")

  //Store "Hello World!" in a variable and then output it
  val output = "Hello World"
  println(output)

  //Create a method that accepts a string as a parameter and then outputs that string
  def output(word: String) = {
    println(word)
  }

  output("William")

  //Create a method that returns a string, in this case “Hello World!”, which you then use to output
  def returnOutput(): String = "Manchester"

  println(returnOutput)

  //Crate a method that does not signify a return type and outputs whatever is given to it then
  //test it by passing the following data types, Double, String, Integer, Boolean
  def squareOf(num1: Int) = num1 * num1

  println(squareOf(12))

  //Create a method that accepts two parameters, one being a string and one being an integer.
  //Your method should return the amount of characters from the end of the string that the integer specifies

  //def lastLetters(x:String,y:Int){

  def stringRemover(word: String, x: Int) {
    println(word.substring(word.length - x))

  }

  stringRemover("William", 4)

  //Create a method that returns two integers as an input and then returns the sum of those

  def addition(num1: Int, num2: Int): Int = num1 + num2

  println("The answer is" + " " + addition(21, 21))

  //Modified version of the above function

  def conditionalAdditon(num1: Int, num2: Int, checker: Boolean): Int = {
    if (checker == true) {
      num1 + num2
    } else {
      num1 * num2
    }
  }

  //Checks condtion if false multiplies the answer
  println(conditionalAdditon(21, 21, false))
  //Checks condtion if true adds the answer
  println(conditionalAdditon(21, 21, true))

  //This method looks to see if a number is 0, if this is the case it will return the number which isnt
  def modifiedConditionalAddition(num1: Int, num2: Int, checker: Boolean): Int = {
    if (checker == true) {
      var answer = num1 + num2
      return answer
    } else if (num1 == 0) {
      return num2
    } else if (num2 == 0) {
      return num1
    } else {
      var answer = num1 * num2
      return answer
    }
  }

  println(modifiedConditionalAddition(39, 39, true))

  def iterator(word: String, iterations: Int) {

    var a = 0

    while (a < iterations) {
      println(word)
      a = a + 1
    }

  }

  def iterationsNew(letter: String, iterations: Int) {
    var a = 0
    while (a < iterations) {
      for (i <- 1 to iterations) {
        print(letter)
      }
      a = a + 1
      println("")
    }
  }

  iterationsNew("H", 4)

  def printIterations(firstWord: String, SecWord1: String, IterationsNew: Int) {
    for (a <- 1 to IterationsNew) {
      if (a % 3 == 0 && a % 5 == 0)
        print(firstWord + " " + SecWord1)
      else if (a % 3 == 0) {
        print(firstWord)
      } else if (a % 5 == 0) {
        print(SecWord1)
      } else {
        print(a)
      }
     if(a != IterationsNew){
       print(",")
     }

    }
  }

  printIterations("Fizz", "Buzz", 15)

  println("")

  def recursiveFunc(word:String,n:Int):Unit = {
    if (n > 0){
      print(word)
      recursiveFunc(word,n -1)
    }

  }

  recursiveFunc("H",2)








}
