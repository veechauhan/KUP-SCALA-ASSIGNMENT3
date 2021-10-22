package edu.KUP

import org.scalatest.funsuite.AnyFunSuite


class LogTest extends AnyFunSuite {

  val log = new Log
   //case 1
  test("Test Log Case 1.") {
   val temp =s"[INFO]:Welcome to Scala Studio."
    assert(log.log("Welcome to Scala Studio.") === temp)
  }
   //case 2
  test("Test Log Case 2.") {
    val temp =s"[INFO]:Hello World!"
    assert(log.log("Hello World!") === temp)
  }





}
