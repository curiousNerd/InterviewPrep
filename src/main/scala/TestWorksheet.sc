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
