package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/6 13:55
 */
object Scala_15_Collection_Method_01 {

  // TODO: Collection Generic Methods

  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3)

    list.size
    list.length // same as size
    list.isEmpty
    list.contains(1)
    list.reverse
    list.distinct

    list.head // get first node
    list.last

    list.headOption // return option
    list.lastOption

    list.tail // get new list ,not contains first

    list.init // get new list,not contains last
    list.inits // get iterator，迭代初始化数据

    list.take(2) // get left 2 elements
    list.takeRight(2) // right 2 elements

    list.drop(2) // delete left 2
    list.dropRight(2)
    println(list.dropWhile(_ % 2 != 0)) // 删除第一个不符合条件的元素

    list.find(_ % 2 == 0) // find eligible element by method

  }

}
