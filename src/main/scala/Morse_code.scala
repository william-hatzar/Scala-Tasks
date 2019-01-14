object Morse_code extends App{


  def morseCodeLookUp(letter: String): String = {

    val lettertoMorse = Map("a" -> ".-", "b" -> "-...", "c" -> "-.-.", "d" -> "-..", "e" -> ".", "f" -> "..-.", "g" -> "--.",
      "h" -> "....", "i" -> "..", "j" -> ".---", "k" -> "-.-", "l" -> ".-..", "m" -> "--", "n" -> "-.", "o" -> "---",
      "p" -> ".--.", "q" -> "--.-", "r" -> ".-.", "s" -> "...", "t" -> "-", "u" -> "..-", "v" -> "...-", "w" -> ".--", "x" -> "-..-", "y" -> "-.--", "z" -> "--.."," " -> "/")

    lettertoMorse(letter)
  }

  def wordLookUp = Map(".-" -> "a", "-..." -> "b", "-.-" -> "c", "-.." -> "d", "." -> "e", "..-." -> "f", "--." -> "g",
    "...." -> "h", ".." -> "i", ".---" -> "j", "-.-" -> "k", ".-.." -> "l", "--" -> "m", "-." -> "n", "---" -> "o",
    ".--." -> "p", "--.-" -> "q", ".-." -> "r", "..." -> "s", "-" -> "t", "..-" -> "u", "...-" -> "v", ".--" -> "w", "-..-" -> "x", "-.--" -> "y", "--.." -> "z","/" -> " ")

  def inputter(word:String): Unit ={

    var newWord = ""

    for (i<- 0 until word.length){
      newWord+= morseCodeLookUp(word.substring(i,i+1))
    }
    print(newWord)
  }

  def outputter(morsetoWord:String) : Unit = {
    var newWord = ""
    for(i <- 0 until morsetoWord.length){
      newWord += wordLookUp(morsetoWord.substring(i,i+1))
    }
    println(newWord)
  }

  println("Output word into morse code")
  inputter(scala.io.StdIn.readLine())
  println()
  println("Output morse code into a word")
  outputter(scala.io.StdIn.readLine())
}

