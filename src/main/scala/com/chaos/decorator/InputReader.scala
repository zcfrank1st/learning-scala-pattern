package com.chaos.decorator
/**
  * Created by zcfrank1st on 6/8/16.
  */
trait InputReader {
  def readLines(): Stream[String]
}

//class AdvancedInputReader(reader: BufferedReader) extends InputReader {
////  override def readLines(): Stream[String] = reader.lines().iterator()
//}

abstract class InputReaderDecorator(inputReader: InputReader) extends InputReader {
  override def readLines(): Stream[String] = inputReader.readLines()
}
