package com.gulu.chapter06

/**
 * @author chocolate
 *         2024/2/4 17:49
 */
object Scala_11_Enum {

  def main(args: Array[String]): Unit = {
    val red = Color.RED  // 内容
    val black = Color.BLACK.id  // ID
    println(red)
  }

  object Color extends Enumeration {
    val RED = Value(1, "red")
    val BLACK = Value(2, "black")
  }

}
