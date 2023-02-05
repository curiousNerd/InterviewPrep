package Principles.classes


class Car (val manufacturer: String, brand: String, var model: String) {
  var speed: Double = 0;
  var gear: Any = 0;
  var isOn: Boolean = false;

  def start(keyType: String): Unit = {
    println(s"Principles.classes.Car started using the $keyType")
  }

  def selectGear(gearNumber: Any): Unit = {
    gear = gearNumber
    println(s"Gear has been changed to $gearNumber")
  }

  def stop(): Unit = {
    speed = 0;
    gear = 0;
    isOn = false;
    println("Principles.classes.Car has stopped.")
  }
}


class Audi(vn: String, subClass: String) extends Car("WV","Sedan","Principles.classes.Audi"){
  override def start(keyType: String) = {
    if(keyType.equalsIgnoreCase("Remote")){
      println("Remote Start not available")
    }else{
      println(s"Principles.classes.Car started using ${keyType}")
      isOn = true
    }
  }
  def getStatus(): Unit = {
    println(s"Status od the car ${vn} is ${isOn}")
  }
}

//object MainObject {
//
//  def main(args: Array[String]): Unit = {
//    val familyCar: Principles.classes.Car = new Principles.classes.Car("Toyota","SUV","123")
//    println("-------")
//    familyCar.start("Remote")
//    familyCar.selectGear("R")
//    familyCar.selectGear(1)
//    familyCar.stop()
//    println("-------")
//    val audiCar = new Principles.classes.Audi("vn123","E")
//    audiCar.start("Remote")
//    audiCar.start("Key")
//    audiCar.getStatus()
//    println("-------")
//
//
//  }
//
//}
