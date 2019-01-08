object Tuesday_Exercise_1 extends App {

  //1st Solution
  def bottleofbeer(num1: Int): Unit = {
    if (num1 > 1) {
      val lyric = s"$num1 bottle of beer on the wall, $num1 bottles of beer."
      val seclyric = s"Take one down and pass it around, ${num1 - 1} bottles of beer on the wall."
      println(lyric)
      println(seclyric)
      bottleofbeer(num1 - 1)
    } else if (num1 - 1 == 0) {
      println("No more bottles of beer on the wall, no more bottles of beer")
      val lastlyric = s"Go to the store and buy some more, 99 bottles of beer on the wall."
      println(lastlyric)
    }
  }

  val x = 99 to 0 by - 1

  def song(counter: Int): String = {
    val counter2 = counter - 1
    s"""         |   $counter bottles of beer on the wall
                 |   $counter bottles of beer
                 |  take one down and pass it around, $counter2 bottles of beer on the wall """
  }
  x.foreach(bigint => if(bigint >= 1)(println(song(bigint)))else(print("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall")))



}
    //2nd Solution




