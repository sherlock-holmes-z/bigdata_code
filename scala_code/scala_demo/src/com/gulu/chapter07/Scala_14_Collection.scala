package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/6 10:09
 */
object Scala_14_Collection {

  def main(args: Array[String]): Unit = {

    // TODO: Array。List,Set 之间可以相互转换
    val array = Array(1, 2, 3, 4)
    val list = array.toList
    val set = array.toSet
    set.toArray
    set.toList

    // TODO: 只有元素类型为tuple是可以转为Map
    val array1 = Array("a" -> 1, "b" -> 2)
    array1.toMap

    // TODO: Map可以转为Array，List,Map，元素类型为元祖
    val map = Map("a" -> 1, "b" -> 2)
    val mapToArray: Array[(String, Int)] = map.toArray
    map.toList
    map.toSet

  }
}
