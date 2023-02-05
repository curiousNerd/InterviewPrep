package Principles.classes

class InnerClass {

  var cityNameList: List[City] = Nil
  def addCity(city: City): Unit = {
    cityNameList = cityNameList :+ city
  }

  class City(name: String, size: Int )
}

//class AddDetails {
//    val virginia = new State
//    val michigan = new State
//
//    val v1 = new virginia.City("herndon", 100)
//    val v2 = new virginia.City("aldie", 101)
//
//    val m1 = new michigan.City("novi", 50)
//    val m2 = new michigan.City("northville", 51)
//}

//object MainObject {
//  def main(args: Array[String]) ={
//
////    val details = new AddDetails
////
////    details.virginia.addCity(details.v1)
////    details.virginia.addCity(details.v2)
////    details.michigan.addCity(details.m1)
////    details.michigan.addCity(details.m2)
////
////    println(details.virginia.cityNameList)
////    println(details.michigan.cityNameList)
//
//    val virginia = new State
//    virginia.addCity(new virginia.City("herndon", 100))
//    virginia.addCity(new virginia.City("aldie", 101))
//
//    val michigan = new State
//    michigan.addCity(new michigan.City("novi", 50))
//    michigan.addCity(new michigan.City("detroit", 51))
//
//    println(virginia.cityNameList)
//    println(michigan.cityNameList)
//
//
//
//  }
//}
