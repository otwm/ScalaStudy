def max(keyBoard: String, target: String, inputLength: Int): Int = {
  //ABABAB ABABA ABABA ABA AB A
  //ABABAB BABAB
  if (inputLength < target.length) {
    return 0
  }

  def value(target: String, inputLength: Int) = {
    var count = 0
    for (index <- 0 to target.length - 1) {
      if (target.substring(index) == target.substring(0, target.length - index)) {
        count += 1
      }
      //    println(s"index : " + index)
      //    println(s"count : " + count)
    }
    count
  }

  var temp0 = value(target, inputLength)
  var temp1 = inputLength - target.length
  var temp2 = target.length / temp0

  println("temp0 : " + temp0)
  println("temp1 : " + temp1)
  println("temp2 : " + temp2)

  println(temp1 / temp0)
  temp1 / temp0 + 1
}

max("AAA", "AB", 11) //4

max("AAA", "AB", 11) //5


