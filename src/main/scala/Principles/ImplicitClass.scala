package Principles

import Principles.ImplicitClass.{StringUtils, StringUtils1}


object ImplicitClass {

  //Doesn't work
//  implicit class StringUtils1(str: String, str2:String) {

    //Works
  implicit class StringUtils(str: String)(implicit val s: String, val r: Int) {

      def addLengthCountNextToEachWord():String = {
        str.split(" ").map(x => {
        x.concat(s" (${x.length})" )
      }).mkString(", ")+s + "| " + r
    }
  }

  implicit class StringUtils1(lst: List[String]) {

    def addLengthCountNextToEachWordInList(): String = {
      lst.map(x => {
        x.concat(s" (${x.length})")
      }).mkString(", ")
    }
  }


}

class Test{
  implicit val a: String = " ++++ "
  implicit val b: Int = 100
  def test_1(): Unit = {
    println(s"Enter a sentence | Test Class .. ")
    val sen: String = io.StdIn.readLine()
    println(sen.addLengthCountNextToEachWord())
  }

}

//object MainObject {
//  implicit val a: String = " --- "
//  implicit val b: Int = 11
//  def main(args: Array[String]): Unit = {
//    val inputList2: List[Int] = List(1,2)
//    println(s"Enter a sentence .. ")
//    val sen: String = io.StdIn.readLine()
//    println(sen.addLengthCountNextToEachWord())
//    val inputList: List[String] = List("anuja","sr")
//    println(inputList.addLengthCountNextToEachWordInList())
//
//
//    val t = new Test
//    t.test_1()
//
//  }
//
//}
