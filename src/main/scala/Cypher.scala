object Cypher extends App {

  object Cypher extends App {

    def cypherlookup(letter:String): String = {

      val map = Map("a" -> "z", "b" -> "y", "c" -> "x", "d" -> "w", "e" -> "v", "f" -> "u", "g" -> "t",
        "h" -> "s", "i" -> "r", "j" -> "q", "k" -> "p", "l" -> "o", "m" -> "n", "n" -> "m", "o" -> "l",
        "p" -> "k", "q" -> "j", "r" -> "i", "s" -> "h", "t" -> "g", "u" -> "f", "v" -> "e", "w" -> "d", "x" -> "c", "y" -> "b", "z" -> "a")

      map(letter)

    }


    def reassignment(word:String): Unit ={

      var newWord = ""

      for (i<- 0 until word.length){
        newWord+= cypherlookup(word.substring(i,i+1))
      }
      print(newWord)

    }

    reassignment("hello")

  }



}

