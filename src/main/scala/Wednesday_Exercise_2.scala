object Wednesday_Exercise_2 {

  def main(args: Array[String]): Unit = {
    val cardNo = "4757146859376053"

    if (checkLuhn(cardNo))
      println("This is a valid card")
    else
      println("This is not a valid card");

  }

  def checkLuhn(cardNo:String): Boolean = {
    val nDigits = cardNo.length
    var nSum = 0
    var isSecond = false
    var i = nDigits - 1

    while (i >= 0) {
      var d = cardNo.charAt(i) - '0'
      if (isSecond == true) d = d * 2
      nSum += d / 10
      nSum += d % 10
      isSecond = !isSecond
      i -= 1; i + 1
    }
    nSum % 10 == 0
  }




}
