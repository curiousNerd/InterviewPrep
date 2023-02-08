val o1: Option[Int] = Some(10)
assert(o1.map(_.toString).contains("10"))
assert(o1.map(_ * 2.0).contains(20))

val o2: Option[Int] = None
assert(o2.map(_.toString).isEmpty)

val v1: Option[Int] = Some(10)
val v2: Option[Int] = None


assert(v1.isDefined)
assert(v2.isEmpty)

2*3

def convertToString(x: Int): String = {
  "Hello "+ x
}

val convertToString1: Function1[Int,String] = x => "Hello "+x.toString
val convertToString2: Int => String = x => "Hello "+x.toString

val convertToString3: Function0[Unit] = () => println("Hello ")
val convertToString4: () => Unit = () => println("Hello ")

val convertToString5: String => Unit = x => println("Hello!! "+x)

println(convertToString(10))
println(convertToString1(20))
println(convertToString2(30))
convertToString3
convertToString4
convertToString5("there")

List(1,2,3).map{ x => x* 2}

