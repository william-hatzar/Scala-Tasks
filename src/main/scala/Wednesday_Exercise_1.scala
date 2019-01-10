import scala.io.Source
import scala.collection.mutable.ArrayBuffer
object Wednesday_Exercise_1 extends App {

  val wordList = List("apple", "hello", "aaaaaaaalep", "appleee")
  val keyboardKeys = "alep".toArray
  var longestWord = ""
  checkWord()

  def checkWord():Unit = {
    for (word <- wordList) {
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
