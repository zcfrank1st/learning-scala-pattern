package com.chaos.abstracts

/**
  * Created by zcfrank1st on 6/7/16.
  */
trait ContainerAT {
  type T
  val data: T

  def compare(other: T) = data.equals(other)
}

class StringContainer(val data: String) extends ContainerAT {
  override type T = String
}

object AbstractTypeExamples {
  def main(args: Array[String]) {
    val stringContainer = new StringContainer("some text")

    println(s"Comparing with string: ${stringContainer.compare("some text")}")

    
  }
}
