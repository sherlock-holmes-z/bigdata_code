package com.gulu.chapter03

/**
 * @author chocolate
 *         2024/1/29 22:31
 */
object Scala_for {

  def main(args: Array[String]): Unit = {
    val array = 1 to 5 // 从1到5，包含5
    val array2 = 1 until 5 //从1直到5（不包含5）
    val array3 = Range(1, 5) //同until

    for (num: Int <- array) {
      println(num)
    }

    println("--------------------------------")

    //如果集合中对象的类型可以判断出来，那么循环体中的类型可以省略
    for (num <- array2) {
      println(num)
    }

  }
}
