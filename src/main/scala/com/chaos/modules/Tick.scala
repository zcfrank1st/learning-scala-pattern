package com.chaos.modules

/**
  * Created by zcfrank1st on 6/7/16.
  */
trait Tick {
  trait Ticker {
    def count(): Int
    def tick(): Unit
  }

  def ticker: Ticker
}

trait TickUser extends Tick {
  class TickUserImpl extends Ticker {
    var curr = 0

    override def count(): Int = curr

    override def tick(): Unit = {
      curr = curr + 1
    }
  }

  object ticker extends TickUserImpl
}

trait Alarm {
  trait Alarmer {
    def trigger(): Unit
  }
  def alarm: Alarmer
}

trait AlarmUser extends Alarm with Tick {
  class AlarmUserImpl extends Alarmer {
    override def trigger(): Unit = {
      if (ticker.count() % 10 == 0) {
        println(s"Alarm triggered at ${ticker.count()}")
      }
    }
  }

  object alarm extends AlarmUserImpl
}

object ModuleDemo extends AlarmUser with TickUser {
  def main(args: Array[String]) {
    (1 to 100).foreach {
      case i =>
        ticker.tick()
        alarm.trigger()
    }
  }
}