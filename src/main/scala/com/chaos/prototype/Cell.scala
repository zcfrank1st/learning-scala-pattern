package com.chaos.prototype

/**
  * Created by zcfrank1st on 6/8/16.
  */
case class Cell (dna: String, proteins: List[String])

object PrototypeExample {
  def main(args: Array[String]) {
    val initCell = Cell("abcd", List("protein1", "protein2"))

    val copy1 = initCell.copy()
    val copy2 = initCell.copy()
    val copy3 = initCell.copy(dna="1111")
  }
}
