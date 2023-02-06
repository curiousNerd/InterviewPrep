package Principles.caseClassAndPatternMatching

class Student(id: Int, name: String) {

  //TODO
}

case class StudentCase(id: Int, name: String)

object MainObject{
  def main(args: Array[String]): Unit = {
    val a1  = StudentCase(1,"Xavier")
    val a2  = StudentCase(1,"Xavier")


    val ob1 = new Student(1,"Xavier")
    val ob2 = new Student(1,"Xavier")

    println("Case Class => ",a1 == a2)
    println("Class => ",ob1 == ob2)

    println(a1.productElement(1))
    println(a1.productArity)
    println(a1.productIterator)

    val v1 = (10,"New")
    println(StudentCase.tupled(v1).name)
  }
}
