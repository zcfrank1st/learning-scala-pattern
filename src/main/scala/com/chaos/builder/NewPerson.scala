package com.chaos.builder

/**
  * Created by zcfrank1st on 6/8/16.
  */
case class NewPerson (firstName: String = "", lastName: String = "", age: Int = 0){
  require(firstName != "", "first name is required.")
  require(lastName != "", "last name is required.")
}


object PersonCaseClassRequireExample {
  def main(args: Array[String]) {
    val newPerson = NewPerson(
      "1",
      "2",
      0
    )
    println(s"${newPerson}")

    val newPerson1 = NewPerson(
      firstName = "john"
    )

    println(s"${newPerson1}")
  }
}
