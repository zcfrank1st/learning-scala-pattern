//package com.chaos.ducktyping
//
//import java.util.StringTokenizer
//
///**
//  * Created by zcfrank1st on 6/8/16.
//  */
//class SentenceParserTokenize {
//  def parse(sentence: String): Array[String] = {
//    val tokenizer = new StringTokenizer(sentence)
//
//    Iterator.continually({
//      val hasMore = tokenizer.hasMoreTokens
//      if (hasMore) {
//        (hasMore, tokenizer.nextToken())
//      } else {
//        (hasMore, null)
//      }
//    }).takeWhile(_._1).map(_._2).toArray
//  }
//}
//
//
//class SentenceParserSplit {
//  def parse(sentence: String): Array[String] = sentence.split("\\s")
//}
//
//object DuckTypingExample {
//  def printSentenceParts(sentence: String, parser: {def parse(sentence: String): Array[String]}) = parser.parse(sentence).foreach(println)
//
//  def main(args: Array[String]) {
//    // TODO: just duck type
//  }
//}
