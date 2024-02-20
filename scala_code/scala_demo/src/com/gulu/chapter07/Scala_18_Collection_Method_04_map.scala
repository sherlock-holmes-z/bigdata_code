package com.gulu.chapter07

import scala.collection.mutable.ListBuffer

/**
 * @author chocolate
 *         2024/2/6 15:26
 */
object Scala_18_Collection_Method_04_map {

  // TODO: map 功能函数
  def main(args: Array[String]): Unit = {
    val listBuffer1 = ListBuffer(1, 2, 3, 4)

    // 即使是可变集合，使用map之后也会返回新的集合
    val listBuffer2 = listBuffer1.map(_ * 2)

    println(listBuffer1)
    println(listBuffer2)
  }

}
