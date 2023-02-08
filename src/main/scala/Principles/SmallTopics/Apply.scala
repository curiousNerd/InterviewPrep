package Principles.SmallTopics

object Apply extends App {
  val convertToString: Int => String = x => "Hello " + x.toString

  // here the apply function is automatically generated. and hence we can call the object convertTostring directly like a function

  println(convertToString(10))

    //to show that apply was generated -
  println(convertToString.apply(10))
}

object Doubler {
  def apply(number: Int) : Int = 2 * number
  val doubleValue: Int => Int = x => x * 2

}

object Main extends App {
  val res = Doubler(2)
  println(res)

  val res1 = Doubler.doubleValue(4)
  val res2 = Doubler.doubleValue.apply(4)
  println(res1)
  println(res2)

  case class Student(name: String, age: Int)

  val res3 = Student("Anuja", 10)
  val res4 = Student.apply("Anuja", 10)

}



object ApplyInCollection extends App {

  // Apply in List - to access the element at index x

  val list1 = List(1, 2, 3, 4, 5)
  println("List " + list1.apply(3)) // this will return 4 (element at index 3)

  val map1 = Map(1 -> "One",
    2 -> "Two")
  println("Map - Key Present " + map1.apply(1)) //returns value at the key
//  println("Map - Key Not Present " + map1.apply(3)) //will throw error

  val set1 = Set(1,1,2,3)
  println("Set - Element Present " + set1.apply(1)) //returns Boolean depending on the element is present or not
  println("Set - Element Not Present " + set1.apply(4))

  val seq1 = Seq(4,4,5,2)

  println("Seq - Element Present " + seq1.apply(2)) //returns element at index
  println("Seq - Element Not Present " + set1.apply(4)) // returns false if element not present


}

