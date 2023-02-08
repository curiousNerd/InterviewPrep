package Principles.SmallTopics

// case class

object UnApply extends App {
  case class Student(name: String, age: Int)

  val v1 = Student.apply("Anuja", 10)
  println(v1.name)
  val v2 = Student.unapply(v1).get
  println(v2._1)


}

object Test extends App {
  case class Doubler(number1: Int, number2: Int)

  object Doubler {
    def apply(n1: Int, n2: Int) = new Doubler(n1, n2)

    def unapply(n: Doubler): Option[(Int,Int)] = Some(n.number1, n.number2)
  }

  val v1 = Doubler.apply(10,20)
  println(v1.number1+"  "+ v1.number2)

  val v2 = Doubler.unapply(v1).get
  println(v2._1+"  "+v2._2)

  case class Student(name: String, age: Int)

  val v3 = Student.apply("Anuja", 10)
  val name = Student.unapply(v3).get._1
  val age = Student.unapply(v3).get._2



}

