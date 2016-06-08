package com.chaos.adts

/**
  * Created by zcfrank1st on 6/7/16.
  */
sealed trait Month

case object January extends Month
case object February extends Month

object MonthDemo {
  def main(args: Array[String]) {
    val month: Month = February
    println(s"month = $month")
  }
}
