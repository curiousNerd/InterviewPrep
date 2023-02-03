val letters: List[String] = List("a", "b", "c")

//// concatenates all values
//println(letters.foldLeft("")((_+_)))

println(letters.foldLeft("-")({ (acc: String, curr: String) => println(s"acc1 : ${acc} | curr1 : ${curr}")
  acc+curr }))


//// add "Mango" at the end of each letter
//println(letters.foldLeft("")({ (acc: String, cur: String) => s"${acc},${cur} Mango" }))
//
//// add Mango to the beginning
//println(letters.foldLeft("Mango")({ (acc: String, cur: String) => s"${acc},${cur} " }))
//
println(letters.foldRight("-")({ (acc: String, curr: String) => println(s"acc1 : ${acc} | curr1 : ${curr}")
  acc+curr }))