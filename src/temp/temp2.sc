package Main

import java.io.{FileOutputStream, FileInputStream}

import scala.annotation.tailrec
import scala.io.StdIn


object Main extends App {
  Console.setIn(new FileInputStream("example.in"))

  Console.setIn(new FileInputStream("B-large-practice (1).in"))
  Console.setOut(new FileOutputStream("B-large-practice (1).out"))


  def solve(s: Int, keyboard: String, expected: String): Double = {
    def repeatRangeNum(): Int = {
      expected.length - (1 until expected.length).find(
        x => expected.substring(x) == expected.substring(0, expected.length - x)
      ).getOrElse(expected.length)
    }

    def manBanana: Int =
      if (percent == 0) 0 else (s - repeatRangeNum) / (expected.length - repeatRangeNum)

    def percent: Double =
      (1.0 /: expected)((acc, x) => acc * (keyboard.count(x == _).toDouble / keyboard.length))

    manBanana - (percent * (s - expected.length + 1))
  }

  val cases = StdIn.readLine().toInt
  (1 to cases) foreach { n =>
    val Array(k, l, s) = StdIn.readLine().split(" ").map(_.toInt)
    val keyboard = StdIn.readLine()
    val expected = StdIn.readLine()

    println(s"Case #$n: ${solve(s, keyboard, expected)}")
  }
}

