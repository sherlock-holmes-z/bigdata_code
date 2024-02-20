package com.gulu.chapter07

import scala.+:

/**
 * @author chocolate
 *         2024/2/5 15:45
 */
object Scala_03_Collection_Array_2 {

  def main(args: Array[String]): Unit = {
    // 构建时增加数据
    val array1 = Array.apply(1, 2, 3, 4)

    // apply能被scala自动识别，可以省略
    val array2 = Array(1, 2, 3, 4)

    // TODO: Array是不可变数组,添加数据，会产生新的数组
    //   单个元素加入数组
    //    val newArray1 = array1.+:(5) // 数组前添加
    //    val newArray2 = array1.:+(6) // 数组后添加
    val newArray1 = 5 +: array1
    val newArray2 = array1 :+ 6

    println(array1.eq(newArray1))
    println(newArray1.mkString(","))
    println(newArray2.mkString(","))

    // 数组相加
    val array3 = newArray1 ++: newArray2
    val array4 = newArray1 ++ newArray2
    println(array3.mkString(","))
  }

}
