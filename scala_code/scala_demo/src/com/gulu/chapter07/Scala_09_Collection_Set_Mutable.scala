package com.gulu.chapter07

import scala.collection.mutable

/**
 * @author chocolate
 *         2024/2/6 0:42
 */
object Scala_09_Collection_Set_Mutable {

  // TODO: 可变的set集合，需要根据包名区分
  def main(args: Array[String]): Unit = {

    val set1: mutable.Set[Int] = mutable.Set(1, 1, 2, 3, 4, 5)

    println(set1)

    // TODO: 可变集合使用方法处理数据
    // 新增
    set1.add(6)

    set1.remove(1)

    // set没有集合位置的概念，无法对指定的位置进行修改
    // 所以这里的修改时修改数据的状态，true添加元素，false删除元素
    set1.update(5, included = false)
    set1.update(55, included = true)

    // 添加元素的另一种写法
    set1(66) = true

    println(set1)
  }
}
