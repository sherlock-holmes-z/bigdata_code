package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/6 15:51
 */
object Scala_20_Collection_Method_06_filter {

  // TODO: 过滤 filter
  //  按照指定条件将数据集中数据过滤，条件成立数据保留，否则丢弃

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4)

    val list1 = list.filter(_ % 2 == 0)
    println(list1)
  }

}
