package Principles.SmallTopics

object MultidimensionalArray extends App {
  val array = Array.ofDim[Int](2,2)
  array(0)(0) = 1
  array(0)(1) = 2
  array(1)(0) = 3
  array(1)(1) = 4

  array foreach {row => row foreach {print}; println}

  array.foreach(row =>
    {row.foreach{x => print(x + " ")}
    println})

  array.foreach{ x => print(x.mkString(" ")); println}


  println(array.map(_.mkString(" ")).mkString("\n"))
  println("---")
}