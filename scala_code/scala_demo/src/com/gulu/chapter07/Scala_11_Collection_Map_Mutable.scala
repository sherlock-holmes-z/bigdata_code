package com.gulu.chapter07

import scala.collection.mutable

/**
 * @author chocolate
 *         2024/2/6 1:04
 */
object Scala_11_Collection_Map_Mutable {

  def main(args: Array[String]): Unit = {
    val map1 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)

    map1.put("d", 4)

    map1.update("a", 0)
    map1.update("e", 6) // key不存在就添加

    map1.remove("b")

    println(map1)

    println(map1.keysIterator.foreach(print)) // 拿所有的key
    println(map1.valuesIterator.foreach(print)) // 拿所有的value


    // 按key获取value，获取的结果为Option,有两种结果：（为了避免空指针异常）
    // Some：有值,如果数据有值，可以获取真实结果
    // None：无值,无法获取结果，获取会报错
    val option: Option[Int] = map1.get("e")
    //    if (option.isEmpty) {
    //      println("no value")
    //    } else {
    //      println(option.get)
    //    }
    // 获取结果，没有结果时返回默认值
    println(option.getOrElse(0))


    // TODO: Map为了操作方法，也有getOrElse()
    println(map1.getOrElse("f", 0))

    map1.clear() // 清空所有元素

    println(map1)

  }

}
