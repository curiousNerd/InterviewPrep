package Principles.constructors

class ClassWithoutParams {

  def show(): Unit = {
    println(" Hello ")
  }

}

class ClassWithParams (val a: String, var b: String, c: String){


  def show(): Unit = {
//    a = "New" //error : defined val
//    b = "New" // work
//    c = "New" // error : noting defined
    println(s" value a: ${a} , value b: ${b}, value c: ${c}")
  }

}


//object MainObject {
//
//  def main(args: Array[String]) = {
//
//    // Create a new object from the class
//    // {Its using Primary Constructor}
//
//    val obj = new ClassWithoutParams()
//    obj.show()
//
//    val obj2 = new ClassWithParams("HelloA", "HelloB", "HelloC")
//    obj2.show()
//    // inside constructor parameter
//    // a is defined using val : it gets get Method so obj2.a is available
//    // b is defined using var : it gets get and set both Method so obj2.b  and obj.b = "New" works
//    // c is not defined with anything : it gets nothing
//    println(s"obj2.a => ${obj2.a}")
//
//    obj2.b = "New"
//    println(s"obj2.b => ${obj2.b}")
//
//  }
//}
