package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/6 14:42
 */
object Scala_16_Collection_Method_02 {

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6)

    println(list.splitAt(2)) // 切分成两个集合，2表示第一个集合两个元素

    list.sliding(2).foreach(print) // 滑动获取2个元素,List(1, 2)List(2, 3)List(3, 4)List(4, 5)List(5, 6)
    println
    list.sliding(2, 2).foreach(print) // 滑动取两个元素，每次向后滑动两位
  }

}
