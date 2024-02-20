package com.gulu.chapter07

import scala.collection.mutable.ListBuffer

/**
 * @author chocolate
 *         2024/2/6 0:22
 */
object Scala_07_Collection_Seq_Buffer {

  // TODO: scala中所有的集合都有可变和不可变两个版本
  //  Seq,List不可变
  //  ListBuffer可变
  def main(args: Array[String]): Unit = {
    val listBuffer1 = ListBuffer(1, 2, 3, 4)
    val listBuffer2 = ListBuffer(5, 6, 7, 8)

    listBuffer1.append(99)
    listBuffer1.appendAll(listBuffer2)
    listBuffer1.update(0, 11)
    listBuffer1.insert(0, 0) // insert插入会让该位置之后的元素全部后移一位

    println(listBuffer1)

    listBuffer1.remove(0)
    listBuffer1.remove(0, 2)

    val newListBuffer = listBuffer1.updated(0, 1) // updated会生成新集合
    println(newListBuffer)

    // 互相转换
    val list = listBuffer1.toList
    val buffer = list.toBuffer
  }

}
