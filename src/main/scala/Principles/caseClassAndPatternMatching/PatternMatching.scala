package Principles.caseClassAndPatternMatching

case class PersonDetails(name: String, age: Int)
case class StudentDetails(marks: Double, standard: String)
case object CaseObject
object MainObject {

  def matchAgainstMultipleCaseClass(p: Any) = {
    p match {
      case PersonDetails(x, y) => println(s"PersonDetails are ${x} , ${y}")
      case PersonDetails("A", 55) => println(s"Matched 1 -> ${p.asInstanceOf[PersonDetails].name}")
      case PersonDetails("B", 40) => println(s"Matched 2 -> ${p.asInstanceOf[PersonDetails].name}")
      case StudentDetails(x, y) => println(s"StudentDetails are ${x} , ${y}")
      case CaseObject => println("Object")
      case _ => println("Not matched")
    }
  }

  def matchForAParticularCaseClass(p: PersonDetails) = {
    p match {
      case PersonDetails("A", 55) => println(s"Matched 1 -> ${p.name}")
      case PersonDetails("B", 40) => println(s"Matched 2 -> ${p.name}")
      case _ => println("Not Matched")
    }
  }
  def main(args: Array[String])={
    matchAgainstMultipleCaseClass(PersonDetails("A", 56))
    matchAgainstMultipleCaseClass(PersonDetails("B", 56))
    matchForAParticularCaseClass(PersonDetails("A", 55))
    matchAgainstMultipleCaseClass(StudentDetails(52, "High school"))
    matchAgainstMultipleCaseClass(StudentDetails(92, "Secondary"))
    matchAgainstMultipleCaseClass(CaseObject)
    matchAgainstMultipleCaseClass("Hello")
    println("-------------------------------")
    matchForAParticularCaseClass(PersonDetails("A", 55))
    matchForAParticularCaseClass(PersonDetails("B", 41))


  }
}