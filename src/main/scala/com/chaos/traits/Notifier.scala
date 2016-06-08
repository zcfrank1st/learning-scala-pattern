package com.chaos.traits

/**
  * Created by zcfrank1st on 6/7/16.
  */
trait Notifier {
  val notificationMessage: String

  def printNotification(): Unit = {
    System.out.println(notificationMessage)
  }

  def clear()
}
