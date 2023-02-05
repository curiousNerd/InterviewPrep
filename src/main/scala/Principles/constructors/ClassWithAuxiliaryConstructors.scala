package Principles.constructors

class ClassWithAuxiliaryConstructors(val a: String, val b: String, var c: Int) {

  def this(p: String) = {
    this(p,"Null",-1)
  }

  def this(p: String, q: String) = {
    this(p, q, -1)
    this.c = p.length + q.length
  }

  def this(r:Int) = {
    this(r.toString)
    this.c = r
  }

}

//object MainObject {
//
//  def main(args: Array[String]): Unit = {
//    val obj = new ClassWithAuxiliaryConstructors("a1","a.com",0)
//    println("Primary Constructor => ",obj.a, obj.b, obj.c)
//
//    val obj1 = new ClassWithAuxiliaryConstructors("a1")
//    println("Auxiliary Constructor 1 => ",obj1.a, obj1.b, obj1.c)
//
//    val obj2 = new ClassWithAuxiliaryConstructors("a11","b123")
//    println("Auxiliary Constructor 2 => ", obj2.a, obj2.b, obj2.c)
//
//    val obj3 = new ClassWithAuxiliaryConstructors("11")
//    println("Auxiliary Constructor 3 => ", obj3.a, obj3.b, obj3.c)
//
//  }
//
//}
