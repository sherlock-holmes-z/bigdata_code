package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/6 0:55
 */
object Scala_10_Collection_Map {

  // TODO: Map是一个trait，一般采用伴生对象apply()构建，不可变
  def main(args: Array[String]): Unit = {
    val a = "a" -> 1
    val map1 = Map(a, "b" -> 2,"b" -> 3)

    // 不可变map集合的数据基本操作还是特殊符号
    val map2 = map1.+("c" -> 3)

    println(map1,map2)


  }

}
