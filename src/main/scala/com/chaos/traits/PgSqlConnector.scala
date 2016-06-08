package com.chaos.traits

/**
  * Created by zcfrank1st on 6/7/16.
  */
abstract class Connector {
  def connect()
  def close()
}

trait ConnectorWithHelper extends Connector {
  def findDriver(): Unit = {
    System.out.println("Find driver called")
  }
}

class PgSqlConnector extends ConnectorWithHelper{
  override def connect(): Unit = {
    System.out.println()
  }

  override def close(): Unit = {
    System.out.println()
  }
}
