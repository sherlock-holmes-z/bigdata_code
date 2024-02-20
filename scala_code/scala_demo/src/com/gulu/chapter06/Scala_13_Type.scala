package com.gulu.chapter06

/**
 * @author chocolate
 *         2024/2/5 14:39
 */
object Scala_13_Type {

  def main(args: Array[String]): Unit = {

    // TODO: 定义新类型名，别名
    type JavaHashMap = java.util.HashMap[String, String]
    val javaHashMap: JavaHashMap = new JavaHashMap()
  }

  class HashMap {

  }
}
