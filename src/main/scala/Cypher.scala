object Cypher {

  def main (args: Array[String]): Unit =
  {
    var allChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("Enter text to convert to cipher")
    var a = scala.io.StdIn.readLine()
    var plainText = a
    plainText = plainText.replaceAll(" ", "")
    plainText = plainText.toUpperCase
    var len = plainText.length
    var len1 = allChar.length
    var cipher = ""
    var i = 0
    var j = 0

    while(i < len){
      var b = plainText.charAt(i)
      while(j < len1){
        var c = allChar.charAt(j)
        if(c == b){
          var index = allChar.indexOf(c)
          var position = (len1-1)-index
          //cipher = cipher + allChar.charAt(position)
          cipher = cipher + allChar(position)
        }
        j = j + 1;
      }
      i = i + 1;
    }
    println(cipher)
  }
}

