package Main

;

import java.io.{FileOutputStream, FileInputStream}

import scala.io.StdIn

object Main extends App {

  println("`212")
  val path = "D:\\dev\\project\\ScalaStudy\\src\\study\\month07\\two\\"

  Console.setIn(new FileInputStream(path + "example.in"))

  //  Console.setIn(new FileInputStream("C-large-practice.in"))
  //  Console.setOut(new FileOutputStream("C-large-practice.out"))

  def solve(c: Int, target: Int, coins: List[Int]): Int = {
    0
  }

  val cases = StdIn.readLine().toInt
  (1 to cases) foreach { n =>
    val Array(c, _, v) = StdIn.readLine().split(" ").map(_.toInt)
    val coins = StdIn.readLine().split(" ").toList.map(_.toInt)

    println(s"Case #$n: ${solve(c, v, coins)}")
  }

}

/*
만들수 잇는 동전
n     주머니속 동전                         ans
0     {}                         1          0
1     {1}                        2          1
3     {1,2}                      4          2
7     {1,2,4}                    5          2
12    {1,2,4,5}                 10          2
22    {1.2.4.5.10}              23          3
45    {1.2.4.5.10.23}           25          3
70    {1.2.4.5.10.23,25}        50          3
120   {1.2.4.5.10.23,25,50}    100
*/




