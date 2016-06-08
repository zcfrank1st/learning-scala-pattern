package com.chaos.builder

/**
  * Created by zcfrank1st on 6/8/16.
  */
case class Person (firstName: String = "", lastName: String = "", age: Int = 0)

object PersonCaseClassExample {
  def main(args: Array[String]) {
    val person1 = Person(
      firstName = "",
      lastName =  "",
      age = 0
    )

    val person2 = Person(
      firstName = ""
    )
  }
}
