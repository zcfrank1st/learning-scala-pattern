package com.chaos.color

import scala.io.AnsiColor

/**
  * Created by zcfrank1st on 6/8/16.
  */
object Color {
  def main(args: Array[String]): Unit = {
    println(AnsiColor.RED + "[hello]" + AnsiColor.GREEN_B + AnsiColor.CYAN +"this is demo")
  }
}
