package com.chaos.adapter


/**
  * Created by zcfrank1st on 6/8/16.
  */
class Logger {
  def log(message: String, severity: String): Unit = {
    println(s"[${severity}]: ${message}")
  }
}

trait Log {
  def info(message: String)
  def debug(message: String)
  def warning(message: String)
  def error(message: String)
}

class AppLogger extends Logger with Log {
  override def info(message: String): Unit = log(message, "info")

  override def warning(message: String): Unit = log(message, "warning")

  override def error(message: String): Unit = log(message, "error")

  override def debug(message: String): Unit = log(message, "debug")
}

object AdapterExample {
  def main(args: Array[String]) {
    val logger = new AppLogger
    logger.info("hello world")
    logger.debug("hello world")
    logger.warning("hello world")
    logger.error("hello world")
  }
}
