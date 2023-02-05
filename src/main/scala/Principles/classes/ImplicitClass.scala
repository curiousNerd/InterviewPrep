package Principles.classes

object ImplicitClass {

  //Doesn't work
  //  implicit class StringUtils1(str: String, str2:String) {

  //Works
  implicit class StringUtils(str: String)(implicit val s: String, val r: Int) {

    def addLengthCountNextToEachWord(): String = {
      str.split(" ").map(x => {
        x.concat(s" (${x.length})")
      }).mkString(", ") + s + "| " + r
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
