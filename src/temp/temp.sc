/**
 *
 * K - 키보드의 수
 * L - 타겟워드의 수
 * S - 입력 가능 수
 *
 * 7 6 6
 * BANANAS
 * MONKEY
 * 2 3 4
 * AA
 * AAA
 * 2 1 2
 * AB
 * B
 * 6 2 2
 * GOOGLE
 * GO
 * 26 11 100
 * ABCDEFGHIJKLMNOPQRSTUVWXYZ
 * ROSENCRANTZ
 *
 * Case #x: y
 * Case #1: 0.0
 * Case #2: 0.0
 * Case #3: 1.0
 * Case #4: 0.8888889
 * Case #5: 9.0
 * 최대 바나나의 수와 평균적으로 남는 바나나의 수
 */
def max(keybord: String, target: String, input: Int): Int = (2 / 1) / 1

def f(keybord: String, b: Int): Int = {
  var repeatCount = 0;
  for (index <- 0 to keybord.length) {
    println(" value : " + keybord.substring(index) + "\n")
    if (keybord == keybord.substring(index)) repeatCount += 1
  }
  b / repeatCount
}

def hasKey(A: String, B: String) = 1

f("AA", 4)

f("AAA", 5)

f("AB", 2) / hasKey("AB", "AB") == 2

max("AB", "AB", 1) //0

max("AB", "AB", 2) //1

max("AB", "AB", 3) //1
max("AB", "AB", 4) //2

max("AB", "AB", 5) //2

max("AB", "AB", 6) //3
max("AB", "ABA", 1) //0

max("AB", "ABA", 2) //0

max("AB", "ABA", 3) //1
max("AB", "ABA", 4) //1

max("AB", "ABA", 5) //2

max("AB", "ABA", 6) //2

max("AB", "AA", 1) //0
max("AB", "AA", 2) //1

max("AB", "AA", 3) //2

max("AB", "AA", 4) //3







max("BANANAS", "MONKEY", 6) //0

max("AA", "AAA", 4) //2
max("AB", "B", 2) //2

max("GOOGLE", "GO", 2) //1
max("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ROSENCRANTZ", 100) //?
def average(keybord: String, target: String, input: Int): Int = 1

average("BANANAS", "MONKEY", 6) //0

average("AA", "AAA", 4) //0
average("AB", "B", 2) //1.0
average("GOOGLE", "GO", 2) //0.8888889

average("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ROSENCRANTZ", 100) //9.0

assert(average("BANANAS", "MONKEY", 6) == 0, "first failed")
assert(average("AA", "AAA", 4) == 0, "second failed")
assert(average("AB", "B", 2) == 1.0, "third failed")
assert(average("GOOGLE", "GO", 2) == 0.8888889, "fourth failed")
assert(average("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "ROSENCRANTZ", 100) == 9.0, "fifth failed")


