object Cypher {

  def main (args: Array[String]): Unit =
  {
    val allChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("Enter text to convert to cipher")
    val a = scala.io.StdIn.readLine()
    var plainText = a
    plainText = plainText.replaceAll(" ", "")
    plainText = plainText.toUpperCase
    val len = plainText.length
    val len1 = allChar.length
    var cipher = ""
    var i = 0
    var j = 0

    while(i < len){
      val b = plainText.charAt(i)
      while(j < len1){
        val c = allChar.charAt(j)
        if(c == b){
          val index = allChar.indexOf(c)
          val position = (len1-1)-index
          cipher = cipher + allChar.charAt(position)
        }
        j = j + 1;
      }
      i = i + 1;
    }
    println(cipher)
  }
}

