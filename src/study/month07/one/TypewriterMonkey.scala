package study.month07

import java.io.{FileOutputStream, FileInputStream}

import scala.io.StdIn

class TypewriterMonkey {

}

/**
 * Created by kdo on 2015-07-06.
 */
object TypewriterMonkey extends App {
  Console.setIn(new FileInputStream("D:\\dev\\project\\ScalaStudy\\src\\study\\month07\\B-small-practice.in"))
  Console.setOut(new FileOutputStream("D:\\dev\\project\\ScalaStudy\\bin\\result\\study\\month07\\B-small-practice.out"))

  val cases = StdIn.readLine().toInt
  println(cases)
  (1 to cases) foreach { n =>
    val Array(k, l, s) = StdIn.readLine().split(" ").map(_.toInt)
    val keyboard = StdIn.readLine()
    val expected = StdIn.readLine()

    println(s"Case #$n:")
  }

  def init(time: Int, keyBorad: String, target: String, input: Int) = {

  }

  def isValid(keyBorad: String, target: String) = {
    var result = true
    target.foreach(char => if (keyBorad.count(_ == char) == 0) result = false)
    result
  }

  def max(keyBorad: String, target: String, input: Int): Int = {
    if (!isValid(keyBorad, target)) {
      return 0
    }

    val repeat = {
      var count = 0
      var remaining = ""
      for (index <- 0 to target.length - 1) {
        if (target.substring(index) == target.substring(0, target.length - index)) {
          count += 1
          remaining = target.substring(index)
        }
      }
      val addString = if (target == remaining) target
      else if (target.startsWith(remaining)) target.substring(remaining.length, target.length)
      else target
      (count, remaining, addString)
    }

    def calculatedValue(value: String): String = {
      if (target.length >= input) target.substring(0, input)
      val temp = value + repeat._3
      if (temp.length > input) temp.substring(0, input) else calculatedValue(temp)
    }

    val _result = calculatedValue(target)
    def max(index: Int = 0, count: Int = 0): Int = {
      if (_result.indexOf(target, index) >= 0) {
        max(_result.indexOf(target, index) + 1, count + 1)
      }
      else count
    }
    max()
  }

  def average(keyBorad: String, target: String, input: Int): Double = {
    var value: Double = 1
    var _max = max(keyBorad, target, input)
    for (char <- target) {
      value *= keyBorad.count(_ == char).toDouble / keyBorad.length.toDouble
      //println(s"value : $value")
    }
    _max - value * _max
  }

}

TypewriterMonkey.main()