package com.chaos.adts

/**
  * Created by zcfrank1st on 6/7/16.
  */
sealed case class RGB(red: Int, green: Int, blue: Int)
object RGBDemo {
  def main(args: Array[String]) {
    val magenta = RGB(255, 0, 255)
    println(s"Magenta is RGB is: $magenta")
  }
}
