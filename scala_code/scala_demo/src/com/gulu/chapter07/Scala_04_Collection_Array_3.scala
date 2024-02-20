package com.gulu.chapter07

/**
 * @author chocolate
 *         2024/2/5 17:12
 */
object Scala_04_Collection_Array_3 {

  def main(args: Array[String]): Unit = {
    // 多维数组
    val array = Array.ofDim[Int](2, 3)
    array.foreach(list => println(list.mkString(",")))

    val array1 = Array(1, 2, 3)
    val array2 = Array(4, 5, 6)
    val array3 = Array.concat(array1, array2) // 合并数组 等于array1 ++: array3
    array3.foreach(print)

    println("--------------------")
    val array4 = Array.range(0, 5) // 指定范围，左闭右开
    array4.foreach(print)

    println("--------------------")
    val array5 = Array.fill[Int](5)(-1) // 创建指定长度数组并填充默认值
    array5.foreach(print)
  }
}
