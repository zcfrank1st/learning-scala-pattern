package com.chaos.traits

/**
  * Created by zcfrank1st on 6/7/16.
  */
class Watch(brand: String, initialTime: Long) {
  def getTime():Long = System.currentTimeMillis() - initialTime
}

object WatchUser {
  def main(args: Array[String]) {
    val expensiveWatch = new Watch("expensive brand", 1000L) with Alarm with Notifier {
      override def trigger(): String = "the alarm was triggered"

      override def clear(): Unit = {
        System.out.println("alarm cleared")
      }

      override val notificationMessage: String = "Alarm is running!"
    }

    val cheapWatch = new Watch("cheap brand", 1000L) with Alarm {
      override def trigger(): String = "the alarm was triggered"
    }

  }
}

object ReallyExpensiveWatchUser {
  def main(args: Array[String]) {
//    val reallyExpensiveWatch = new Watch("really expensive brand", 1000L) with ConnectorWithHelper {
//      override def connect(): Unit = {
//        println("Connected with another connector.")
//      }
//
//      override def close(): Unit = {
//        println("Closed with another connector.")
//      }
//    }
  }
}

trait AlarmNotifier {
  this: Notifier =>

  def trigger(): String
}

object SelfTypeWatchUser {
  def main(args: Array[String]) {
    val watch = new Watch("alarm with notification", 1000L) with AlarmNotifier with Notifier {
      override def trigger(): String = "Alarm triggered."

      override def clear(): Unit = {
        println("Alarm cleared.")
      }

      override val notificationMessage: String = "The notification."
    }
  }
}


