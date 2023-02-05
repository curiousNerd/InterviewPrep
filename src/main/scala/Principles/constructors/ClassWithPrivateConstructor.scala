package Principles.constructors

class ClassWithPrivateConstructor private(name: String, email: String, role: String)

object ClassWithPrivateConstructor {

  // defining new methods
  def createWorker(name: String, email: String):
  ClassWithPrivateConstructor = new ClassWithPrivateConstructor(name, email, "W")

  def createManager(name: String, email: String):
  ClassWithPrivateConstructor = new ClassWithPrivateConstructor(name, email, "M")

}
//
//object MainObject {
//  def main(args: Array[String]) = {
//
//    println(ClassWithPrivateConstructor.createWorker("b1","b.com"))
//    println(ClassWithPrivateConstructor.createManager("c1","c.com"))
//
//  }
//}
