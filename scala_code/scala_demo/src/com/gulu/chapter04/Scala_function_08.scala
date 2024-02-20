package com.gulu.chapter04

/**
 * @author chocolate
 *         2024/1/31 16:55
 *
 *         将函数作为返回值
 */
object Scala_function_08 {
  def main(args: Array[String]): Unit = {
    // 函数的返回值一般不声明，使用自动推断
    def outer() = {

      def inner() = {
        println("inner")
      }

      inner _
    }

    // 获取函数对象，并调用
    val f = outer()
    f()

    // 不使用变量接收直接调用
    outer()()
  }
}
