package Principles.SmallTopics

case class StudentCase(name: String, age: Int)

val v1 = StudentCase("Anuja",12)
// this is equivalent to
val v2 = StudentCase.apply("Anuja",10)

class Student(name: String, age: Int)
// this doesn't work => new is needed
//val v3 = Student("Anuja",12) //incorrect
val v3 = new Student("Anuja",10)

val doubleFunction: Function1[Int, Int] = x => 2 * x
// above is same as
val doubleFunction1: (Int) => Int = x => 2 * x