package com.chaos.traits

/**
  * Created by zcfrank1st on 6/7/16.
  */

trait FormalGreeting {
  def hello(): String
}

trait InformalGreeting {
  def hello(): String
}

class Greeter extends FormalGreeting with InformalGreeting{
  override def hello(): String = "good morning, sir/madam!"
}

object GreeterUser {
  def main(args: Array[String]) {
    val greeter = new Greeter()
    println(greeter.hello())
  }
}


trait A {
  def hello(): String = "hello, i am trait a"
}

trait B {
  def hello(): String = "hello, i am trait b"
}

object Clashing extends A with B {
  override def hello(): String = super[A].hello()

  def main(args: Array[String]) {
    println(hello())
  }
}

