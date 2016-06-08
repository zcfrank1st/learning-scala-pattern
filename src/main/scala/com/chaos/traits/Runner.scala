package com.chaos.traits

/**
  * Created by zcfrank1st on 6/7/16.
  */
trait Ping {
  def ping(): Unit = {

  }
}

trait Pong {
  def pong(): Unit = {

  }
}

trait PingPong extends Ping with Pong {
  def pingPong(): Unit = {
    ping()
    pong()
  }
}


class Runner extends PingPong{
  def main(args: Array[String]) {
    pingPong()
  }
}

object MixinRunner extends Ping with Pong {
  def main(args: Array[String]) {
    ping()
    pong()
  }
}
