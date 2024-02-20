package com.gulu.chapter2

/**
 * @author chocolate
 *         2024/1/28 22:59
 */
object Scala_DataType {

  def main(args: Array[String]): Unit = {

    // java分为基本类型和引用类型
    // scala是完全面向对象的语言，没有基本类型的概念，都是类
    var age: Int = 10
    Unit

    // scala分为任意值类型和任意引用类型
    // 任意值类型：8大类型
    //       Unit（表示没有返回值,只有一个对象（））
    //       StringOps 和字符串相关

    // 任意引用类型 ： scala的集合，scala的类，java的类
    //              Null类型,引用类型值为空时，null本身具有Null类型
    //              Nothing类型，一般用于异常处理
    var name: Null = null
    val value: Nothing = test1()
  }

  def test(): Unit = {

  }

  def test1(): Nothing = {
    throw new NullPointerException()
  }

}
