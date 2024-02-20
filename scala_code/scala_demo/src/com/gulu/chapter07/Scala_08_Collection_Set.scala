package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/6 0:22
 */
object Scala_08_Collection_Set {

  // TODO: Set 无序，数据不可重复集合
  //  Set是一个trait，不可以直接构建对象，使用伴生对象apply方法构建，默认为不可变集合
  def main(args: Array[String]): Unit = {
    val set1 = Set(1, 2, 3, 4, 5, 5)
    println(set1)

    // 不可变集合的基本数据操作都是采用特殊符号
    val set2 = set1 + 6
    println(set2)

  }


}
