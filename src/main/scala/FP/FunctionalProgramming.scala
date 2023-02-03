package FP

import scala.language.postfixOps

object FunctionalProgramming {

  def main(args: Array[String]): Unit = {

//    fp1_takeUserInputAndSum()
//
//    println("Enter n for no. of iterations : ")
//    val n: Int = scala.io.StdIn.readInt()
//    fp2_printNTimes(n)
//
//    println("Enter number of times each element in the list should be repeated")
//    val num: Int = scala.io.StdIn.readInt()
//    val dummyList: List[Int] = List(1,2,3,4,5)
//    println(fp3_ListReplication(num, dummyList))
//
//    println("Enter filter Condition")
//    val input: Int = scala.io.StdIn.readInt()
//    val inList: List[Int] = List(1,5,2,7,3,9,2)
//    println(fp4_filterValues(input, inList))
//
//    val inList_1: List[Int] = List(1,5,2,7,3,9,2)
//    println(s"input list => ${inList_1}")
//    println(fp5_filterOddPositions(inList_1))
//
//    println("Enter the length for the array")
//    def readInt = scala.io.StdIn.readInt()
//    println(fp6_returnArrayOfInputLength(readInt)) // passing a function
//
//    val inList_2: List[Int] = List(2,3,5,7,9)
//    println(s"Original List : ${inList_2}")
//    println(fp7_reverseListWithoutReverse(inList_2))

    val inList_3: List[Int] = List(2,3,5,7,9)
    println(inList_3)
    println(fp8_sumOfOddElements(inList_3))




      }



    def fp1_takeUserInputAndSum(): Unit = {
      // Take 2 numbers from user and return the sum
      println("Enter 2 numbers - one in each line")
      println(s"sum = ${io.Source.stdin.getLines().take(2).map(_.toInt).sum}")
      println("Enter 2 numbers - space separated")
      println(s"sum = ${io.StdIn.readLine().split(" ").map(_.toInt).sum}")

    }

    def fp2_printNTimes(n: Int): Unit = {
      // Print Hello World N times

      if (n > 0) {
        println("Hello World")
        fp2_printNTimes(n - 1)
      } else return
    }

    def fp3_ListReplication(num: Int, arr: List[Int]): List[Int] = {
      // Repeat each element of a list n times and return the list of size len(arr)*n
      // 1st way
      println(arr.map(x => List.fill(num)(x)).flatten)
      // 2nd way
      println(arr.flatMap(x => List.fill(num)(x)))
      // 3rd way
      println(arr.flatMap(List.fill(num)(_)))

      arr.flatMap(List.fill(num)(_))
    }

    def fp4_filterValues(input: Int, arr: List[Int]): List[Int] = {
      // Output only those values that are less than specified value
      // 1st way
      println(arr.filter(x => x < input))
      // 2nd way
      println(arr.filter(_ < input))

      arr.filter(_ < input)
    }

    def fp5_filterOddPositions(arr: List[Int]): List[Int] = {
      // return a new list removing elements at odd positions
      // 1. .zipWithIndex returns (element, index)
      // 2. .filter( all elements where index is odd so _._2 [index] % 2 != 0 (odd))
      // 3. .map(for all values just take the elements _._1)
      arr.zipWithIndex.filter(_._2 % 2 != 0).map(_._1)
    }

    def fp6_returnArrayOfInputLength(n: Int): List[Int] = {
      println(List.fill(n)(1)) // Fills with 1
      println(1 to n toList)
      List.fill(n)(1)
    }

    def fp7_reverseListWithoutReverse(arr: List[Int]): List[Int] = {
//      println(arr.zipWithIndex)
//
//      arr.zipWithIndex.map({
//        case (_, i) => arr(arr.size-i-1)
//      })
//
//      arr.zipWithIndex.map({
//        x => (x._1, arr(arr.size - x._2 - 1))
//      }).map(_._1)

      arr.zipWithIndex.map({
        x => (arr(arr.size - x._2 - 1))
      })

    }

  def fp8_sumOfOddElements(arr: List[Int]): Int = {
    arr.filter(_ % 2 != 0).sum
  }

//  def fp9_calculateLength(arr: List[Int]): Int = {
//    arr.foldLeft(0)(_ + 1)
//  }




}
