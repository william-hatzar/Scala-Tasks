import java.util.TimeZone
import java.util.TimeZone.getAvailableIDs
object Thursday_Exercise extends App{
  //Blackjack
  def blackjack(num1:Int,num2:Int){
    println("Blackjack")
    if(num1 > 21 && num2 > 21) println(0)
    else if(num1 > num2) println(num1)
    else println(num2)
  }
  blackjack(21,21)

  def uniqueSum(num1:Int,num2:Int,num3:Int): Int ={
    println("Unique Sum")
    var amount = 0
    if(num1 == num2 && num2 == num3) amount = 0
    else if(num1 == num2) amount = num3
    else if(num2 == num3) amount = num1
    else if(num1 == num3) amount = num2
    else amount = num1 + num2 + num3
    amount
  }

  println(uniqueSum(1,2,3))



  val availId = TimeZone.getAvailableIDs

  println("Available Ids are: ")

  for (i <- 0 until  availId.length){ println(availId(i)) }

  println("Messing around with for each")

  val originalMessage = "William/Is/Cool"










}
