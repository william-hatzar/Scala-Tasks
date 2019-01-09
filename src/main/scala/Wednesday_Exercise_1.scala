import scala.io.Source
import scala.collection.mutable.ArrayBuffer
object Wednesday_Exercise_1 extends App {

//  val scalaDictionairy = Source.fromFile("C:\\Users\\Admin\\Documents\\enable1.txt").toArray
  ////  println("Enter a random integer")
  ////  val length = scala.io.StdIn.readInt()
  ////  val newWords = new Array[String](length)
  ////
  ////  for(i <- 0 until  newWords.length){
  ////    println("Enter a string to compare")
  ////    newWords(i) = scala.io.StdIn.readLine()
  ////  }
  ////
  ////  val counter = 0
  ////
  ////  for(i <- 0 until newWords.length){
  ////    for(i <- 0 until scalaDictionairy.length){
  ////      if(newWords.length != scalaDictionairy.length){
  ////        false
  ////      }
  ////    }
  ////    for(i <- 0 until newWords.length -1){
  ////      if(newWords[i] >= b[i]){
  ////        false
  ////      }
  ////    }
  ////  }
  val listOfWords = List("apple", "hello", "aaaaaaaalep", "appleee")
  val keyboardKeys = "alep".toArray
  var longestWord = ""
  checkWord()

  def checkWord():Unit = {
    for (word <- listOfWords) {
      var containsLetters = ArrayBuffer[Boolean]()
      for (letter <- keyboardKeys) {
        if (word.contains(letter)) containsLetters.append(true)
        else containsLetters.append(false)
      }
      if (containsLetters.exists(value => value) && longestWord.length < word.length) {
        longestWord = word
      }
    }
    println(longestWord)
  }










}
