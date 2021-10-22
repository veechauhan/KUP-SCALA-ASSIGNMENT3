package edu.KUP

import scala.annotation.tailrec

class TailRecursionFactorial {
  def factorial(num: Int): Int = {
    @tailrec
    def loop(acc: Int, num: Int): Int = num match {
      case 0 => acc
      case _ => loop(acc * num, num - 1)
    }

    loop(1, num)
  }
}

