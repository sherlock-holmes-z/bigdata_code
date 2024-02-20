package com.gulu.chapter03

import scala.io.Source

/**
 * @author chocolate
 *         2024/1/29 23:16
 *
 *         while循环
 */
object Scala_while {

  def main(args: Array[String]): Unit = {
    val source = Source.fromFile("D:\\bigdata_code\\scala_code\\scala_demo\\src\\com\\gulu\\test\\FileScalaRead.txt")

    // 迭代器获取每一行
    val iterator = source.getLines()
    while (iterator.hasNext) {
      println(iterator.next())
    }
  }
}
