package com.chaos.traits

/**
  * Created by zcfrank1st on 6/7/16.
  */
class NotifierImpl(val notificationMessage: String) extends Notifier {
  override def clear(): Unit = System.out.println("cleared")
}
