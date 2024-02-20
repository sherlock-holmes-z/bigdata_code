package com.gulu.chapter07

import scala.collection.mutable.ArrayBuffer

/**
 * @author chocolate
 *         2024/2/5 17:33
 */
object Scala_05_Collection_ArrayBuffer_1 {

  // TODO: 可变数组
  def main(args: Array[String]): Unit = {

    val arrayBuffer = new ArrayBuffer[Int]()

    // 增加数据
    arrayBuffer.append(1)
    arrayBuffer.appendAll(Array.range(3, 5))

    // 插入数据
    arrayBuffer.insert(0, 99) // 在0位置插入99,给位置的数据往后移动一位，插入的位置必须已存在
    arrayBuffer.insertAll(0, Array.range(3, 5))

    // 修改
    arrayBuffer.update(2, 100)
    // 修改并创建新数组
    val arrayBuffer1 = arrayBuffer.updated(3, 333)

    println(arrayBuffer, arrayBuffer1) // scala中自定义集合

    // 删除
    arrayBuffer.remove(0)
    arrayBuffer.remove(0, 2) // 从第0位开始，删除两个，数据不足会索引越界

    // 查询
    println(arrayBuffer.apply(0))
    println(arrayBuffer(0))
    println(arrayBuffer)

    // 可变转不可变
    val toArray = arrayBuffer.toArray
    // 不可变转可变
    val toBuffer = toArray.toBuffer
  }

}
