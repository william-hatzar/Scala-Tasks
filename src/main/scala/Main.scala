class Person(var name: String, var age: Int)


object Main extends App{

  def showEvaluationOnCall() :Unit = {
    val person = new Person("John",36)

    println("Person age is " + person.age)

    person.age = 32

    println("Persons age is: " + person.age)
  }

showEvaluationOnCall()


}
