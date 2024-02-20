package com.gulu.chapter04

/**
 * @author chocolate
 *         2024/2/1 17:34
 *
 *         惰性函数
 */
object Scala_function_15_Lazy {

  def main(args: Array[String]): Unit = {

    def func() = {
      println("lazy")
      "func"
    }

    // 使用lazy关键字，函数会在结果被使用时再调用
    lazy val str = func()
    println("========")
    println(str)

  }
}
