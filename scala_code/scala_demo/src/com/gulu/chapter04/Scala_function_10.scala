package com.gulu.chapter04

/**
 * @author chocolate
 *         2024/1/31 17:28
 *
 *         闭包
 */
object Scala_function_10 {

  // 闭包场景
  // 1.内部函数使用外部的数据
  // 2.函数作为对象使用，改变了函数本身的生命周期
  // 3.所有匿名函数都有闭包（匿名函数是作为函数对象传参的）
  // 4.内部函数返回到外部使用，也会有闭包

  // todo 只要改变了变量或函数的生命周期，就会有闭包

  def main(args: Array[String]): Unit = {
    def out(x: Int) = {
      def inner(y: Int) = {
        // 一个函数使用了外部的变量，就会改变这个变量的生命周期，【闭包】
        // 编译的class文件中，将外部变量作为参数传递到了内部函数中
        println(x + y)
      }

      inner _
    }

    val inner = out(1)
    inner(2)
  }

}
