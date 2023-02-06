package Principles.Sequence

import scala.::

object MainObject {

  def main(arge: Array[String]) = {
    val list1 = "Hello" :: "there" :: "!" :: Nil
    val lazyList1 = "Hello" #:: "there" #:: "!" #:: LazyList.empty
    val stream1 = "Hello" #:: "there" #:: "!" #:: Stream.empty

    println(s"list => ${list1}")
    println(s"lazyList => ${lazyList1}")
    println(s"stream => ${stream1}")

  }



}
