package com.gulu.chapter10

/**
 * @author chocolate
 *         2024/2/21 13:47
 */
object Scala_06_Implicit {

  // TODO: 隐式机制
  //  1.当前代码作用域
  //  2.当前代码上级作用域
  //  3.当前类所在包作用域
  //  4.当前类的父类或特质
  //  5.直接import
  def main(args: Array[String]): Unit = {
    val list = List(1, 3, 2, 4)
    // sortBy的第二个参数为隐式参数
    list.sortBy(num => num)(Ordering.Int.reverse)
      .foreach(println)


  }
}
