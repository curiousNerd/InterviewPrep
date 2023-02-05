package Principles.constructors

class ClassWithProtectedConstructor protected (val name: String, email: String, role: String)

class Worker(name: String, email: String) extends ClassWithProtectedConstructor(name, email, "W")
class Manager(name: String, email: String) extends ClassWithProtectedConstructor(name, email, "M")

//object MainObject {
//
//  def main(args: Array[String]): Unit = {
//    val obj = new Worker("a1","a.com")
//    val obj2 = new Manager("b1","b.com")
//
//    println(obj.name)
//    println(obj2.name)
//
//  }
//
//}